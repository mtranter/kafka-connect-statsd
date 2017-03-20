package com.judopay.connect.statsd

import java.util

import com.judopay.connect.statsd.config.Configs
import com.judopay.connect.statsd.sink.StatsdSinkTask
import org.apache.kafka.common.config.ConfigDef
import org.apache.kafka.connect.connector.Task
import org.apache.kafka.connect.sink.SinkConnector

import scala.collection.JavaConversions._

/**
  * Created by marktranter on 07/03/17.
  */
class StatsdSinkConnector extends SinkConnector {

  private var _props: util.Map[String,String] = _

  override def taskClass(): Class[_ <: Task] = classOf[StatsdSinkTask]

  override def taskConfigs(maxTasks: Int): util.List[util.Map[String, String]] = 0 until maxTasks map {_ => _props}

  override def stop(): Unit = ()

  override def config(): ConfigDef = Configs.CONFIG_DEF

  override def start(props: util.Map[String, String]): Unit = _props = props

  override def version(): String = "1.0"
}



