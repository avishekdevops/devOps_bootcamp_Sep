FROM openjdk:8-jdk-alpine
EXPOSE 8084
COPY /target/cicd-pipeline-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
MAINTAINER "Avishek Modak"