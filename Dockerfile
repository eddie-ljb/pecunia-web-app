FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080