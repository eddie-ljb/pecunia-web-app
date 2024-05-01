FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/pecunia-0.2.0-SNAPSHOT.jar pecunia-0.2.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pecunia-0.2.0-SNAPSHOT.jar"]