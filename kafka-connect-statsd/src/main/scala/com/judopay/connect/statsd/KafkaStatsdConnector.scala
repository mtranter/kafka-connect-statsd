package com.judopay.connect.statsd

import org.apache.kafka.common.config.Config
import org.apache.kafka.connect.data.Struct
import org.apache.kafka.connect.sink.SinkRecord

/**
  * Created by mark on 07/03/17.
  */


object ConfigConstants {
  val extractorsKey = "stats.extractors"
  val statType = "stats.type"
  val stateNameFormat = "stats.name.format"
}

trait StatsdClient {
  def sendStat(key: String, stat: Int)
}

  trait StatNameGenerator {
    def generateStatName(topic: String, key: String): String
  }

class FormatStatNameGenerator(format: String) extends StatNameGenerator {
  override def generateStatName(topic: String, property: String): String = {
    format.replace("{topic}", topic).replace("{property}", property)
  }
}

class KafkaStatsdConnector(topicValueMap: Map[String,List[String]], stateNameGenerator: StatNameGenerator, client: StatsdClient) {
  def sendRecord(sinkRecord: SinkRecord) = {
    val topic = sinkRecord.topic()
    val value = sinkRecord.value()
    topicValueMap.getOrElse(topic, List()).foreach(p => sendTopicValue(value, topic, p))
  }

  private def sendTopicValue(value: AnyRef, topic: String, property: String) = {
    val valStruct = value.asInstanceOf[Struct]
    val statKey = stateNameGenerator.generateStatName(topic,property)
    client.sendStat(statKey, valStruct.get(property).asInstanceOf[Int])
  }
}
