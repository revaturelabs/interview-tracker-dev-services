FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

COPY pom.xml /
COPY src src/

RUN mvn package

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS

COPY --from=MAVEN_BUILD /target/APIGateway-0.0.1-SNAPSHOT.jar /apigateway.jar
#ADD target/APIGateway-0.0.1-SNAPSHOT.jar apigateway.jar
EXPOSE 8765
# ENTRYPOINT exec java $JAVA_OPTS -jar apigateway.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar apigateway.jar

