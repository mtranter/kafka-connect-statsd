package com.judopay.connect.statsd

import com.judopay.connect.statsd.config.ConfigConstants
import com.judopay.connect.statsd.sink.StatsdRecordDispatcher
import org.apache.kafka.common.config.Config
import org.apache.kafka.connect.data.{Schema, SchemaBuilder, Struct}
import org.apache.kafka.connect.sink.SinkRecord
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mark on 07/03/17.
  */
class StatsdRecordDispatcherSpec extends FlatSpec with Matchers{

  "A StatsdRecordDispatcher" should "send an integer gauge value from sink record" in {

    val mockStatsdClient = new MockStatsdClient()
    val cfg =
      Map("topic" -> List(
        Map(
          ConfigConstants.PerTopic.statType -> StatType.Value.asInstanceOf[AnyRef],
          ConfigConstants.PerTopic.property -> "keyname".asInstanceOf[AnyRef])))

    val connector = new StatsdRecordDispatcher(Map("topic" -> List(Extractor("topic", StatType.Value, Some("keyname"))).toArray),
      new MockKeyNameGenerator("judo.topic.keyname"), mockStatsdClient)

    val source = SchemaBuilder.struct()
      .version(2)
      .field("keyname", Schema.INT32_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("keyname", 5)

    connector.sendRecord(new SinkRecord("topic", 0, null, null, source, sourceStruct,5))

    assert(mockStatsdClient.recievedStats.contains("judo.topic.keyname"))
    assert(mockStatsdClient.recievedStats("judo.topic.keyname").head.toInt === 5)
  }

  it should "send an increment message from sink record" in {

    val mockStatsdClient = new MockStatsdClient()

    val connector = new StatsdRecordDispatcher(Map("topic" -> List(Extractor("topic", StatType.Count, Some("keyname"))).toArray),
      new MockKeyNameGenerator("judo.topic.keyname"), mockStatsdClient)

    val source = SchemaBuilder.struct()
      .version(2)
      .field("keyname", Schema.INT32_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("keyname", 5)

    connector.sendRecord(new SinkRecord("topic", 0, null, null, source, sourceStruct,5))

    assert(mockStatsdClient.increments.contains("judo.topic.keyname"))
    assert(mockStatsdClient.increments("judo.topic.keyname") === 1)
  }

  it should "send an increment message from sink record when no extractor is present" in {

    val mockStatsdClient = new MockStatsdClient()

    val connector = new StatsdRecordDispatcher(Map("topic" -> List().toArray),
      new MockKeyNameGenerator("judo.topic"), mockStatsdClient)

    val source = SchemaBuilder.struct()
      .version(2)
      .field("keyname", Schema.INT32_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("keyname", 5)

    connector.sendRecord(new SinkRecord("topic", 0, null, null, source, sourceStruct,5))

    assert(mockStatsdClient.increments.contains("judo.topic"))
    assert(mockStatsdClient.increments("judo.topic") === 1)
  }

  it should "send an increment message from sink record when no extractors are empty" in {

    val mockStatsdClient = new MockStatsdClient()

    val connector = new StatsdRecordDispatcher(Map(),
      new MockKeyNameGenerator("judo.topic"), mockStatsdClient)

    val source = SchemaBuilder.struct()
      .version(2)
      .field("keyname", Schema.INT32_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("keyname", 5)

    connector.sendRecord(new SinkRecord("topic", 0, null, null, source, sourceStruct,5))

    assert(mockStatsdClient.increments.contains("judo.topic"))
    assert(mockStatsdClient.increments("judo.topic") === 1)
  }

  class MockKeyNameGenerator(nameToReturn: String) extends StatNameGenerator {
    override def generateStatName(topic: String, property: Option[String], value: Option[AnyRef]): String = nameToReturn
  }

  class MockStatsdClient extends StatsdClient {

    var recievedStats: Map[String, List[Double]] = Map()
    var increments: Map[String, Int] = Map()

    override def recordGauge(key: String, stat: Long): Unit = recievedStats += (key -> (stat.toDouble :: recievedStats.getOrElse(key,List[Double]())))


    override def incrementCounter(key: String): Unit = increments += (key -> (increments.getOrElse(key,0) + 1))
  }
}
