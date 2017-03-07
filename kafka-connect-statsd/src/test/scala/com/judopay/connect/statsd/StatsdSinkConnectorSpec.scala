package com.judopay.connect.statsd

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.JavaConversions._
/**
  * Created by marktranter on 07/03/17.
  */
class StatsdSinkConnectorSpec extends FlatSpec with Matchers{
  "A StatsdSinkConnector" should "map the props to a list of props" in {
    val sut = new StatsdSinkConnector()
    sut.start(Map("name" -> "joe"))
    val actual = sut.taskConfigs(5)
    assert(actual.size() === 5)
  }

}
