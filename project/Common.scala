import sbt._
import Keys._

object Common {

  val scalaV = "2.11.8"

  val vsn = "0.2-SNAPSHOT"

  def pimpedProject(id: String, path: String): Project = {
    Dependencies(Resolvers(Project(id, file(path))))
      .settings(scalaVersion := scalaV)
      .settings(version := vsn)
      .settings(Defaults.itSettings: _*)
      .settings(organization := "com.judopay")
      .settings(name := "kafka-connect-statsd")
      .configs(IntegrationTest)

  }
}