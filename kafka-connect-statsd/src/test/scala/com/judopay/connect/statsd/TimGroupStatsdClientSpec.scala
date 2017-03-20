package com.judopay.connect.statsd

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by marktranter on 07/03/17.
  */
class TimGroupStatsdClientSpec extends FlatSpec with Matchers{
  "A TimGroupStatsdClient" should "parse a connection string" in {
    val actual = TimGroupStatsdClient("localhost:80")
    assert(actual.statsdPort === 80)
    assert(actual.statsdHostName === "localhost")
  }
}
