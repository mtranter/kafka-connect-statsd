
name := "root"



val `kafka-connect-statsd` = Common.pimpedProject("kafka-connect-statsd","kafka-connect-statsd").settings(antlr4Settings)


val root = Project("root", file(".")).aggregate(`kafka-connect-statsd`)

//val `kafka-connect-statsd-macros` = Common.pimpedProject("kafka-connect-statsd","kafka-connect-statsd-macros")
