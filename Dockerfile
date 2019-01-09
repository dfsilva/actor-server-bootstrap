FROM openjdk:8u151-jre
MAINTAINER Conecta IM <oss@conecta.im>
RUN apt-get update
RUN apt-get install -y --only-upgrade openssl
RUN apt-get install -y libapr1
ADD target/docker/stage/var /var
ADD templates /var/lib/actor/templates
ENTRYPOINT bin/conecta-server
WORKDIR /var/lib/actor
EXPOSE 9070 9080 9090