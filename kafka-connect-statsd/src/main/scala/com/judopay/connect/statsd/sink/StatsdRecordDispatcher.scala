package com.judopay.connect.statsd.sink

import com.judopay.connect.statsd.config.ConfigConstants
import com.judopay.connect.statsd.{Extractor, StatNameGenerator, StatType, StatsdClient}
import org.apache.kafka.connect.data.Struct
import org.apache.kafka.connect.sink.SinkRecord

class StatsdRecordDispatcher(topicValueMap: Map[String,Array[Extractor]], stateNameGenerator: StatNameGenerator, client: StatsdClient) {

  def sendRecord(sinkRecord: SinkRecord) = {
    val topic = sinkRecord.topic()
    val value = sinkRecord.value()
    topicValueMap.get(topic) match {
      case Some(m) if m.length > 0 => {
        m.foreach{ cfg =>
          sendTopicValue(value, topic, cfg.property, cfg.statType)
        }
      }
      case Some(m) if m.isEmpty => client.incrementCounter(stateNameGenerator.generateStatName(topic))
      case None => client.incrementCounter(stateNameGenerator.generateStatName(topic))
    }
  }

  private def sendTopicValue(value: AnyRef, topic: String, property: Option[String], statType: StatType) = property match {
      case Some(p) => {
        val valStruct = value.asInstanceOf[Struct]
        val propertyVal = valStruct.get(p)
        val statKey = stateNameGenerator.generateStatName(topic, Option(propertyVal).map(_.toString), Option(propertyVal))
        statType match {
          case StatType.Count => client.incrementCounter(statKey)
          case StatType.Value => propertyVal match {
            case s:java.lang.Short => client.recordGauge(statKey,s.toLong)
            case l:java.lang.Long => client.recordGauge(statKey,l)
            case i:java.lang.Integer => client.recordGauge(statKey,i.toLong)
            case v:Any => throw new Exception(s"Stat type of ${v.getClass.getName} cannot be used as a StatType.Amount. Only shorts, ints & longs")
          }
        }
      }
      case None =>
    }
}


