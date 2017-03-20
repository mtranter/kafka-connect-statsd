# kafka-connect-statsd


#### Config example
~~~~
name: my-sweet-stats
connector.class=com.judopay.connect.statsd.StatsdSinkConnector
topics=transactions
statsd.connect=statsd.judopay.com:8080
statsd.value.extractors=
    SEND count() of * from transactions to judo.transactions.${apiapplicationrecid}.count,
    SEND count() of * from transactions where status = 5 to  judo.transactions.blocked.count,
    SEND value() of useragent from transactions to judo.transactions.useragents.${useragent}
~~~~