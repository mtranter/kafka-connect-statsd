package com.judopay.connect.statsd

import org.apache.kafka.connect.data.Struct
import org.apache.kafka.connect.sink.SinkRecord

import scala.collection.JavaConversions._
/**
  * Created by mark on 07/03/17.
  */
object StatExtractor {
  def extract(expr: String, sinkRecord: SinkRecord): AnyRef = {
    val struct = sinkRecord.asInstanceOf[Struct]
    struct.get(expr)
  }
}
