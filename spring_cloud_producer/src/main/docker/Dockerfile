FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9011
ADD spring_cloud_producer-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]