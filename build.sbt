
name := "root"

val `kafka-connect-statsd` = Common.pimpedProject("kafka-connect-statsd","kafka-connect-statsd")
  .settings(antlr4Settings: _*)
    .settings(publishTo := Some("Artifactory Realm" at "http://192.168.43.183:8081/artifactory/libs-snapshot-local"))
    .settings(credentials += Credentials("Artifactory Realm", "192.168.43.183", "teamcity", "ntxVjXyAGs00"))
      .settings(antlr4PackageName in Antlr4 := Some("com.judopay.connect.statsd"))
        .settings(
        artifact in (Compile, assembly) ~= { art =>
          art.copy(`classifier` = Some("assembly"))
        }
      ).
      settings(addArtifact(artifact in (Compile, assembly), assembly).settings: _*)

val root = Project("root", file(".")).aggregate(`kafka-connect-statsd`).settings(publish := { })

//val `kafka-connect-statsd-macros` = Common.pimpedProject("kafka-connect-statsd","kafka-connect-statsd-macros")
