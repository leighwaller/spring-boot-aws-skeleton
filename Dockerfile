FROM openjdk:8-jre-alpine

ARG JARFILE=target/spring-boot-aws-starter*.jar

VOLUME /tmp
WORKDIR /app

RUN echo Packaging with jar: $JARFILE
COPY $JARFILE /app/service.jar

EXPOSE 8090

CMD java ${JAVA_OPTS} -Xmx256m -jar /app/service.jar
