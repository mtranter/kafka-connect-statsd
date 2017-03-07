package com.judopay.connect.statsd

/**
  * Created by marktranter on 07/03/17.
  */
import java.io.File
import java.nio.file.{Path, Paths}

import com.github.dockerjava.api.DockerClient
import com.spotify.docker.client.DefaultDockerClient
import com.whisk.docker.config.DockerKitConfig
import com.whisk.docker.impl.spotify.SpotifyDockerFactory
import com.whisk.docker.{DockerContainer, DockerKit}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time._
import org.scalatest.{BeforeAndAfterAll, Suite}
import org.slf4j.LoggerFactory

import scala.concurrent._
import scala.concurrent.duration._

trait DockerTestKit extends BeforeAndAfterAll with ScalaFutures with DockerKit with DockerKitConfig  { self: Suite =>

  private lazy val log = LoggerFactory.getLogger(this.getClass)
  val kafkaConnectContainer = configureDockerContainer("docker.kafkaconnect")

  override def dockerContainers: List[DockerContainer] = {

    super.dockerContainers ++ Seq("zookeeper","kafka", "schemaregistry")
      .map(n => configureDockerContainer("docker." + n)) :+ kafkaConnectContainer
  }

  def dockerInitPatienceInterval =
    PatienceConfig(scaled(Span(20, Seconds)), scaled(Span(10, Millis)))

  def dockerPullImagesPatienceInterval =
    PatienceConfig(scaled(Span(1200, Seconds)), scaled(Span(250, Millis)))

  override def beforeAll(): Unit = {
    super.beforeAll()
    startAllOrFail()
    val client  = DefaultDockerClient.fromEnv().build()
    val id  = Await.result(kafkaConnectContainer.id, 2 seconds)
    client.execCreate(id, Array("bash", "mkdir","/usr/share/java/kafka-connect-statsd"))
    client.copyToContainer(Paths.get("/home/marktranter/judo/kafka-connect-statsd/kafka-connect-statsd/target/scala-2.11/kafka-connect-statsd_2.11-1.0.jar"), id, "/usr/share/java/kafka-connect-cassandra-judo")
    client.restartContainer(id)

  }

  override def afterAll(): Unit = {
    stopAllQuietly()
    super.afterAll()

  }
}