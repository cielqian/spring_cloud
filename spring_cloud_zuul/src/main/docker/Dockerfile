FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9010
ADD spring_cloud_zuul-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]