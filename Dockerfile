FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/0.0.1-SNAPSHOT.jar 0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/0.0.1-SNAPSHOT.jar"]