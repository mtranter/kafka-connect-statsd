package com.judopay.connect.statsd.sink

import java.util

import com.judopay.connect.statsd.{ TimGroupStatsdClient}
import com.judopay.connect.statsd.config.{ConfigConstants, ExtractorConfig}
import org.apache.kafka.clients.consumer.OffsetAndMetadata
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.connect.sink.{SinkRecord, SinkTask}

import scala.collection.JavaConverters._

/**
  * Created by marktranter on 07/03/17.
  */
class StatsdSinkTask extends SinkTask {

  var statsdRecordDispatcher: Option[StatsdRecordDispatcher] = None

  override def stop(): Unit = ()

  override def put(records: util.Collection[SinkRecord]): Unit = statsdRecordDispatcher foreach {rd => records.asScala.foreach(r => rd.sendRecord(r))}

  override def flush(offsets: util.Map[TopicPartition, OffsetAndMetadata]): Unit = ()

  override def start(props: util.Map[String, String]): Unit = {
    val statsdClient = TimGroupStatsdClient(props.get(ConfigConstants.STATSD_CONNECT_CONFIG_KEY))
    val extractors = props.get(ConfigConstants.EXTRACTORS_CONFIG_KEY).split(',')
      .map(s => ExtractorConfig.parse(s.trim))
      .groupBy(e => e.topic)

    statsdRecordDispatcher = Some(
      new StatsdRecordDispatcher(extractors, statsdClient )
    )
  }

  override def version(): String = "1.0"
}
