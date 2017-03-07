package com.judopay.connect.statsd.config

import org.apache.kafka.common.config.ConfigDef

/**
  * Created by mark on 07/03/17.
  */


object ConfigConstants {

  private[statsd] object PerTopic {
    val statType = "statsd.type"
    val property = "statsd.property"

    val statsDispatcher = "STATS_DISPATCHER";
  }

  val STATSD_GROUP = "statsd"
  val STATSD_CONNECT_CONFIG_KEY = "statsd.connect"
  val STATSD_CONNECT_CONFIG_DOC = "The statsd api host and port name e.g. statsd-uat:8069"
  val STATSD_CONNECT_CONFIG_DISPLAY = "Statsd connection string"

  val EXTRACTORS_CONFIG_KEY = "statsd.value.extractors"
  val EXTRACTORS_CONFIG_DOC = "Describes how to extract gauge values from a connector record. e.g. topic.property::count or topic.property::gauge"
  val EXTRACTORS_CONFIG_DISPLAY = "Extractors"

  val STATSD_METRIC_FORMAT_KEY = "statsd.metric.format"
  val STATSD_METRIC_DOC = "The format to use to create statsd metric names"
  val STATSD_METRIC_DISPLAY = "Metric Format"
}

object Configs {

  import ConfigConstants._

  val CONFIG_DEF = new ConfigDef()
      .define(STATSD_CONNECT_CONFIG_KEY, ConfigDef.Type.STRING, ConfigDef.NO_DEFAULT_VALUE,
        ConfigDef.Importance.HIGH, STATSD_CONNECT_CONFIG_DOC,STATSD_GROUP,1,
        ConfigDef.Width.LONG, STATSD_CONNECT_CONFIG_DISPLAY)
    .define(STATSD_METRIC_FORMAT_KEY, ConfigDef.Type.STRING, "",
      ConfigDef.Importance.MEDIUM, STATSD_METRIC_DOC,STATSD_GROUP,2,
      ConfigDef.Width.LONG, STATSD_METRIC_DISPLAY)
    .define(EXTRACTORS_CONFIG_KEY, ConfigDef.Type.STRING, "",
      ConfigDef.Importance.MEDIUM, EXTRACTORS_CONFIG_DOC,STATSD_GROUP,3,
      ConfigDef.Width.LONG, EXTRACTORS_CONFIG_DISPLAY)

}