
FROM openjdk:8-jdk-alpine

ENV SBT_VERSION 0.13.8
ENV SBT_HOME /usr/local/sbt-launcher-packaging-${SBT_VERSION}
ENV PATH ${PATH}:${SBT_HOME}/bin
RUN apk add --update bash && rm -rf /var/cache/apk/*
RUN apk add --update curl && rm -rf /var/cache/apk/*

# Install sbt
RUN curl -sL "http://dl.bintray.com/sbt/native-packages/sbt/$SBT_VERSION/sbt-$SBT_VERSION.tgz" | gunzip | tar -x -C /usr/local && \
    echo -ne "- with sbt $SBT_VERSION\n" >> /root/.built

ENV PATH="/usr/local/sbt/bin:${PATH}"

RUN sbt
