import sbt._
import Keys._

object Resolvers {

  val myResolvers: Seq[Resolver] = Seq()

  def apply(project: Project): Project = {
    project.settings(resolvers ++= myResolvers)
  }
}