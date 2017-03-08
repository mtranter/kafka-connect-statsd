package com.judopay.connect.statsd

import com.judopay.connect.statsd.config.ExtractorConfig
import org.apache.kafka.connect.data.{Schema, SchemaBuilder, Struct}
import org.apache.kafka.connect.sink.SinkRecord
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mark on 08/03/17.
  */
class ExtractorConfigSpec extends FlatSpec with Matchers{
  "The ExtractorConfig parse method" should "parse a simple send stmt" in {
    val cfg = ExtractorConfig.parse("send count() of * from transactions to judo.transactions.count ")
    assert(cfg.topic === "transactions")
    assert(cfg.statType === StatType.Count)
    val sr = getSimpleSinkRecord()
    assert(cfg.metric(sr) === "judo.transactions.count")
  }


  "The ExtractorConfig parse method" should "parse a simple send stmt with fields and templated metric" in {
    val cfg = ExtractorConfig.parse("send count() of * from transactions to judo.transactions.count.${useragent}")
    assert(cfg.topic === "transactions")
    assert(cfg.statType === StatType.Count)
    val sr = getSimpleSinkRecord("transactions","useragent","mozilla")
    assert(cfg.field === None)
    assert(cfg.metric(sr) === "judo.transactions.count.mozilla")
  }

  "The ExtractorConfig parse method" should "parse a simple send stmt with value of fields" in {
    val cfg = ExtractorConfig.parse("send value() of statuscode from transactions to judo.transactions.count")
    assert(cfg.topic === "transactions")
    assert(cfg.statType === StatType.Value)
    val sr = getSimpleSinkRecord()
    assert(cfg.field.get(sr) === "STATUS")
    assert(cfg.metric(sr) === "judo.transactions.count")
  }

  "The ExtractorConfig parse method" should "parse a send stmt with fields and a string where clause" in {
    val cfg = ExtractorConfig.parse("send count() of * from transactions  where statuscode = 'STATUS' to judo.transactions.count")
    assert(cfg.topic === "transactions")
    assert(cfg.statType === StatType.Count)

    val sr = getSimpleSinkRecord()
    assert(cfg.predicate.get(sr))
    assert(cfg.metric(sr) === "judo.transactions.count")
  }

  "The ExtractorConfig parse method" should "parse a send stmt with fields and a int where clause" in {
    val cfg = ExtractorConfig.parse("send count() of value from transactions  where statuscode = 5 to judo.transactions.count")
    assert(cfg.topic === "transactions")
    assert(cfg.statType === StatType.Count)

    val source = SchemaBuilder.struct()
      .version(2)
      .field("statuscode", Schema.INT32_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("statuscode", 5)


    assert(cfg.predicate.get(new SinkRecord("transactions",0,source,null, null, sourceStruct, 0)))
  }

  "The ExtractorConfig parse method" should "parse a send stmt with fields and a string not where clause" in {
    val cfg = ExtractorConfig.parse("send count() of value from transactions  where statuscode = 'status' to judo.transactions.count")
    assert(cfg.topic === "transactions")
    assert(cfg.statType === StatType.Count)


    val source = SchemaBuilder.struct()
      .version(2)
      .field("statuscode", Schema.STRING_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put("statuscode", "STATUS")


    assert(!cfg.predicate.get(new SinkRecord("transactions",0,source,null, null, sourceStruct, 0)))
  }

  private def getSimpleSinkRecord(topic: String = "transactions", key: String = "statuscode", value: String = "STATUS") = {
    val source = SchemaBuilder.struct()
      .version(2)
      .field(key, Schema.STRING_SCHEMA)
      .build()

    val sourceStruct = new Struct(source)
    sourceStruct.put(key, value)
    new SinkRecord(topic, 1, null, null, source, sourceStruct, 1)
  }

}