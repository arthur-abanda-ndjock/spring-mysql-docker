#FROM openjdk:17-jdk-slim
#FROM openjdk:17-jdk-slim
#FROM openjdk:17-oracle depecrated
FROM eclipse-temurin:17.0.8_7-jre-jammy
RUN apt-get update && apt-get install -y procps
#FROM liberica-openjdk-alpine:17.0.7-7
COPY target/spring-mysql-docker.jar /app.jar
# this port should be mapped to 7555 in docker host -v 80:8080
EXPOSE 8080 
ENTRYPOINT ["java","-jar","/app.jar"]