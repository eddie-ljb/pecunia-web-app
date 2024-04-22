FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/pecunia-0.1.3-SNAPSHOT.jar pecunia-0.1.3-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pecunia-0.1.3-SNAPSHOT.jar"]