import sbt._
import Keys._

object Dependencies {
  object Versions {
    val scalatest = "3.0.1"
    val kafkaConnect = "0.10.1.1"
    val statsd = "3.0.1"
  }

  val kafkaConnect = "org.apache.kafka" % "connect-api" % Versions.kafkaConnect
  val statsd = "com.timgroup" % "java-statsd-client" % Versions.statsd
  val reflect = "org.scala-lang"    % "scala-reflect"     % Common.scalaV

  val scalatest = "org.scalatest" %% "scalatest" % Versions.scalatest % "test"

  val testDependencies = scalatest

  val commonDependencies = Seq(testDependencies)

  val appDepends = Seq(kafkaConnect,statsd)
  val macroDepends = Seq(kafkaConnect, reflect)

  val projectDependencies: Map[String,Seq[ModuleID]] = Map("kafka-connect-statsd" -> appDepends, "kafka-connect-statsd-macros" -> macroDepends)

  def apply(project: Project): Project = {
    project.
      settings(libraryDependencies ++= commonDependencies).
      settings(libraryDependencies ++= projectDependencies(project.id))
  }
}