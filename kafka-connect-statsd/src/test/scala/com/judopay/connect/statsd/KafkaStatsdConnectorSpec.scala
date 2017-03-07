package com.judopay.connect.statsd

import org.apache.kafka.common.config.Config
import org.apache.kafka.connect.data.{Schema, SchemaBuilder, Struct}
import org.apache.kafka.connect.sink.SinkRecord
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mark on 07/03/17.
  */
class KafkaStatsdConnectorSpec extends FlatSpec with Matchers{
  "A KafkaStatsdConnector" should "integer value from sink record" in {
    val extractorConfig = "topic.keyname"
    val statNameFormatConfig = "judo.${topic}.${property}"
    val statType = StatType.Value

    val mockStatsdClient = new MockStatsdClient()

    val connector = new KafkaStatsdConnector(Map("topic" -> List("keyname")), new MockKeyNameGenerator("judo.topic.keyname"), mockStatsdClient)

    val source = SchemaBuilder.struct()
      .version(2)
      .field("keyname", Schema.INT32_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("keyname", 5)

    connector.sendRecord(new SinkRecord("topic", 0, null, null, source, sourceStruct,5))

    assert(mockStatsdClient.recievedStats.contains("judo.topic.keyname"))
    assert(mockStatsdClient.recievedStats("judo.topic.keyname").head === 5)
  }

  class MockKeyNameGenerator(nameToReturn: String) extends StatNameGenerator {
    override def generateStatName(topic: String, key: String): String = nameToReturn
  }

  class MockStatsdClient extends StatsdClient {

    var recievedStats: Map[String, List[Int]] = Map()

    override def sendStat(key: String, stat: Int): Unit = recievedStats += (key -> (stat :: recievedStats.getOrElse(key,List[Int]())))
  }
}
