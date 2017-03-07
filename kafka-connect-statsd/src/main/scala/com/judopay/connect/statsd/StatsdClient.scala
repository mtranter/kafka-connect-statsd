package com.judopay.connect.statsd

import com.timgroup.statsd.NonBlockingStatsDClient

/**
  * Created by marktranter on 07/03/17.
  */
trait StatsdClient {
  def recordGauge(key: String, stat: Long)

  def incrementCounter(key: String)
}

object TimGroupStatsdClient {
  def apply(connectionString: String) = {
    connectionString.split(':').toList match {
      case x :: Nil => throw new Exception("Invalid connection string format. Must be in the format host:port")
      case x :: xs => new TimGroupStatsdClient(x, xs.head.toInt)
    }
  }
}

class TimGroupStatsdClient(private[statsd] val statsdHostName: String, private[statsd] val statsdPort: Int) extends StatsdClient {

  private val wrapped = new NonBlockingStatsDClient("", statsdHostName, statsdPort)

  override def recordGauge(key: String, stat: Long): Unit = wrapped.recordGaugeValue(key, stat)

  override def incrementCounter(key: String): Unit = wrapped.incrementCounter(key)
}