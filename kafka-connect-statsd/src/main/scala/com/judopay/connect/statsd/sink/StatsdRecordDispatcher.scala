package com.judopay.connect.statsd.sink

import com.judopay.connect.statsd.config.ExtractorConfig
import com.judopay.connect.statsd.{StatType, StatsdClient}
import org.apache.kafka.connect.data.Struct
import org.apache.kafka.connect.sink.SinkRecord

import java.lang.{Integer => jInt, Short => jShort, Long => jLong}

class StatsdRecordDispatcher(topicValueMap: Map[String,Array[ExtractorConfig]],  client: StatsdClient) {

  def sendRecord(sinkRecord: SinkRecord) = {
    val topic = sinkRecord.topic()
    topicValueMap.get(topic) match {
      case Some(m) if m.length > 0 => {
        m.foreach{ cfg =>
          if(cfg.predicate(sinkRecord)){
            val value = cfg.field match {
              case Some(f) => sinkRecord.value().asInstanceOf[Struct].get(f)
              case None => sinkRecord.value()
            }
            val statKey = cfg.metric(sinkRecord)
            cfg.statType match {
              case StatType.Count => client.incrementCounter(statKey)
              case StatType.Value => value match {
                case s:jShort  => client.recordGauge(statKey,s.asInstanceOf[java.lang.Short].toLong)
                case i:jInt=> client.recordGauge(statKey,i.asInstanceOf[java.lang.Integer].toLong)
                case l:jLong => client.recordGauge(statKey,l.asInstanceOf[java.lang.Long])
                case v:Any => throw new Exception(s"Stat type of ${v.getClass.getName} cannot be used as a StatType.Amount. Only shorts, ints & longs")
              }
            }
          }
        }
      }
      case _ =>
    }
  }
}


