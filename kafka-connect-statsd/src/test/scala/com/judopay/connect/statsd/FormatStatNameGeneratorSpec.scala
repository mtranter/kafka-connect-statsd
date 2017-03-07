package com.judopay.connect.statsd

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by marktranter on 07/03/17.
  */
class FormatStatNameGeneratorSpec extends FlatSpec with Matchers {
  "A FormatStatNameGenerator" should "generate a topic only key" in {
    val generator = new FormatStatNameGenerator("{topic}.{property}.{value}")
    val actual = generator.generateStatName("some-topic")

    assert(actual === "some-topic")
  }

  it should "generate a topic and property only key" in {
    val generator = new FormatStatNameGenerator("{topic}.{property}.{value}")
    val actual = generator.generateStatName("some-topic", Some("name"))

    assert(actual === "some-topic.name")
  }

  it should "generate a topic, property and value only key" in {
    val generator = new FormatStatNameGenerator("{topic}.{property}.{value}")
    val actual = generator.generateStatName("some-topic", Some("user-agent"), Some("mozilla"))

    assert(actual === "some-topic.user-agent.mozilla")
  }
}
