package com.judopay.connect.statsd

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by marktranter on 07/03/17.
  */
class ExtractorSpec extends FlatSpec with Matchers{
  "The Extractor companion object" should "correctly parse extractors config string when only supplied with a topic" in {
    val extractor = Extractor("topic")
    assert(extractor.topic === "topic")
    assert(extractor.statType === StatType.Count)
    assert(extractor.property === None)
  }
  "The Extractor companion object" should "correctly parse extractors config string when supplied with a topic and a property" in {
    val extractor = Extractor("topic.property")
    assert(extractor.topic === "topic")
    assert(extractor.statType === StatType.Count)
    assert(extractor.property === Some("property"))
  }
  "The Extractor companion object" should "correctly parse extractors config string when supplied with a topic a property and a count type" in {
    val extractor = Extractor("topic.property::count")
    assert(extractor.topic === "topic")
    assert(extractor.statType === StatType.Count)
    assert(extractor.property === Some("property"))
  }
  "The Extractor companion object" should "correctly parse extractors config string when supplied with a topic a property and a value type" in {
    val extractor = Extractor("topic.property::value")
    assert(extractor.topic === "topic")
    assert(extractor.statType === StatType.Value)
    assert(extractor.property === Some("property"))
  }

}
