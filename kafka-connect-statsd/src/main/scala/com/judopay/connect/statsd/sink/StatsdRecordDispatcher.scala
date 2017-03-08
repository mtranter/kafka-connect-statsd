package com.judopay.connect.statsd.sink

import com.judopay.connect.statsd.config.{ExtractorConfig}
import com.judopay.connect.statsd.{StatType, StatsdClient}
import org.apache.kafka.connect.sink.SinkRecord

class StatsdRecordDispatcher(topicValueMap: Map[String,Array[ExtractorConfig]],  client: StatsdClient) {

  def sendRecord(sinkRecord: SinkRecord) = {
    val topic = sinkRecord.topic()
    topicValueMap.get(topic) match {
      case Some(m) if m.length > 0 => {
        m.foreach{ cfg =>
          if(cfg.predicate.isEmpty || cfg.predicate.get(sinkRecord)){
            val value = cfg.field.map(f => f(sinkRecord))
            val statKey = cfg.metric(sinkRecord)
            cfg.statType match {
              case StatType.Count => client.incrementCounter(statKey)
              case StatType.Value => value match {
                case s:Some[java.lang.Short] => client.recordGauge(statKey,s.get.toLong)
                case l:Some[java.lang.Long] => client.recordGauge(statKey,l.get)
                case i:Some[java.lang.Integer] => client.recordGauge(statKey,i.get.toLong)
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


