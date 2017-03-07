package com.judopay.connect.statsd

/**
  * Created by marktranter on 07/03/17.
  */
case class Extractor(topic: String, statType: StatType, property: Option[String])

object Extractor {
  def apply(extractor: String): Extractor = {

    val pairs = extractor.split('.')

    if (pairs.length == 1) {
      Extractor(pairs(0), StatType.Count, None)
    }
    else if (pairs.length != 2) {
      throw new Exception("Extractors must be in the format topic.property topic.property::count or topic.property::value")
    }else {
      val (property, statType) = pairs(1).split("::").toList match {
        case x :: Nil => (x, StatType.Count)
        case x :: xs => {
          val statType = xs.head.toLowerCase() match {
            case "count" => StatType.Count
            case "value" => StatType.Value
            case v => throw new Exception(s"Unknown stattype: $v")
          }
          (x, statType)
        }
      }
      Extractor(pairs(0), statType, Option(property))
    }
  }

}