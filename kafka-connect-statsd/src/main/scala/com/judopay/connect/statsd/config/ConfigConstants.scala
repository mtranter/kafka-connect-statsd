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
  val EXTRACTORS_CONFIG_DOC = "Describes how to extract gauge values from a connector record. e.g. send count() * from transactions where resultstatuscode = 5 to judopay.tranactions.blocked"
  val EXTRACTORS_CONFIG_DISPLAY = "Extractors"

}

object Configs {

  import ConfigConstants._

  val CONFIG_DEF = new ConfigDef()
      .define(STATSD_CONNECT_CONFIG_KEY, ConfigDef.Type.STRING, ConfigDef.NO_DEFAULT_VALUE,
        ConfigDef.Importance.HIGH, STATSD_CONNECT_CONFIG_DOC,STATSD_GROUP,1,
        ConfigDef.Width.LONG, STATSD_CONNECT_CONFIG_DISPLAY)
    .define(EXTRACTORS_CONFIG_KEY, ConfigDef.Type.STRING, "",
      ConfigDef.Importance.MEDIUM, EXTRACTORS_CONFIG_DOC,STATSD_GROUP,3,
      ConfigDef.Width.LONG, EXTRACTORS_CONFIG_DISPLAY)

}