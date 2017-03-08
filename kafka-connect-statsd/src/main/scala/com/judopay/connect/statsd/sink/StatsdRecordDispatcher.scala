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
                case Some(s) if s.isInstanceOf[java.lang.Short] => client.recordGauge(statKey,s.asInstanceOf[java.lang.Short].toLong)
                case Some(i) if i.isInstanceOf[java.lang.Integer] => client.recordGauge(statKey,i.asInstanceOf[java.lang.Integer].toLong)
                case Some(l) if l.isInstanceOf[java.lang.Long] => client.recordGauge(statKey,l.asInstanceOf[java.lang.Long])
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


