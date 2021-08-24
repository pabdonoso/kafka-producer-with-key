FROM openjdk:11-jdk-slim
RUN mkdir -p /tmp/shared/components
COPY target/kafka-producer-with-key-1.1-SNAPSHOT.jar /tmp/shared/components
WORKDIR /tmp/shared/components
ENTRYPOINT ["java","-jar","kafka-producer-with-key-1.1-SNAPSHOT.jar"]
