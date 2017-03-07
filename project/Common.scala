import sbt._
import Keys._

object Common {

  val scalaV = "2.11.8"

  val vsn = "1.0"

  def pimpedProject(id: String, path: String): Project = {
    Dependencies(Resolvers(Project(id, file(path)))).settings(scalaVersion := scalaV).settings(version := vsn)
  }
}