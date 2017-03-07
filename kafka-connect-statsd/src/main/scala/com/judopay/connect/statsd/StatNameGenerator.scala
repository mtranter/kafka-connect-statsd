package com.judopay.connect.statsd

/**
  * Created by marktranter on 07/03/17.
  */


trait StatNameGenerator {
  def generateStatName(topic: String, property: Option[String] = None, value: Option[AnyRef] = None): String
}

class FormatStatNameGenerator(format: String) extends StatNameGenerator {

  val topicReplaceRegex = "([\\W-_])?\\{topic\\}".r
  val propertyReplaceRegex = "([\\W-_])?\\{property\\}".r
  val valueReplaceRegex = "([\\W-_])?\\{value\\}".r

  override def generateStatName(topic: String, property: Option[String], value: Option[AnyRef] = None): String = {

    val withTopic = topicReplaceRegex.replaceAllIn(format, topic)
    val withProperty = propertyReplaceRegex.replaceAllIn(withTopic, property match {
      case Some(p) => "$1" + p
      case None => ""
    })
    valueReplaceRegex.replaceAllIn(withProperty, value match {
      case Some(v) => "$1" + v.toString
      case None => ""
    })
  }
}
