package com.judopay.connect.statsd



/**
  * Created by marktranter on 07/03/17.
  */
case class Extractor(topic: String, statType: StatType, property: Option[String])

object Extractor {

  private val topicOnlyRegex = "(\\w+)".r
  private val topicWithStat = "(\\w+)::(\\w+)".r
  private val topicWithProperty = "^(\\w+).(\\w+)".r

  def apply(extractor: String): Extractor = {

    extractor.split("::").toList match {
      case topicValue
    }

      extractor.split('.').toList match {
      case topic :: Nil => Extractor(topic, StatType.Count, None)
      case topic :: rest :: Nil =>
        rest.split("::").toList match {
        case property :: Nil => Extractor(topic, StatType.Count, Some(property))
        case property :: "count" :: Nil => Extractor(topic, StatType.Count, Some(property))
        case property :: "value" :: Nil => Extractor(topic, StatType.Value, Some(property))
        case _ => throwInvalidExtractor()
      }
      case _ => throwInvalidExtractor()
    }
  }

  private def throwInvalidExtractor() = throw new Exception("Extractors must be in the format topic.property topic.property::count or topic.property::value")

}