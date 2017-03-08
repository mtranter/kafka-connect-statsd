package com.judopay.connect.statsd

import com.judopay.connect.statsd.config.ExtractorConfig
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mark on 08/03/17.
  */
class ExtractorConfigSpec extends FlatSpec with Matchers{
  "The ExtractorConfig parse method" should "parse a simple send stmt" in {
    val cfg = ExtractorConfig.parse("send count of messages from transactions to judo.transactions.count")
    assert(cfg.topic === "transactions")
    assert(cfg.metric === "judo.transactions.count")
    assert(cfg.statType === StatType.Count)
  }
}