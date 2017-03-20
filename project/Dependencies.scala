import sbt._
import Keys._

object Dependencies {
  object Versions {
    val scalatest = "3.0.1"
    val kafkaConnect = "0.10.1.1"
    val statsd = "3.0.1"
    val dockerScalaTest = "0.9.0"
    val antlr = "4.6"
  }

  val kafkaConnect = "org.apache.kafka" % "connect-api" % Versions.kafkaConnect % "provided"
  val statsd = "com.timgroup" % "java-statsd-client" % Versions.statsd
  val reflect = "org.scala-lang"    % "scala-reflect" % Common.scalaV % "provided"
  val antlr =  "org.antlr" % "antlr4-runtime" % Versions.antlr

  val scalatest = "org.scalatest" %% "scalatest" % Versions.scalatest % "test"
  val dockerTest = "com.whisk" %% "docker-testkit-core" % Versions.dockerScalaTest % "test"
  val dockerScalaTest = "com.whisk" %% "docker-testkit-scalatest" % Versions.dockerScalaTest % "test"
  val dockerScalaTestImpl = "com.whisk" %% "docker-testkit-impl-spotify" % Versions.dockerScalaTest % "test"
  val dockerWhiskConfig = "com.whisk" %% "docker-testkit-config" % Versions.dockerScalaTest % "test"


  val commonDependencies = Seq(scalatest, dockerTest, dockerScalaTest, dockerScalaTestImpl, dockerWhiskConfig)

  val appDepends = Seq(kafkaConnect,statsd,  antlr)
  val macroDepends = Seq(kafkaConnect, reflect)

  val projectDependencies: Map[String,Seq[ModuleID]] = Map("kafka-connect-statsd" -> appDepends, "kafka-connect-statsd-macros" -> macroDepends)

  def apply(project: Project): Project = {
    project.
      settings(libraryDependencies ++= commonDependencies).
      settings(libraryDependencies ++= projectDependencies(project.id))
  }
}