FROM eclipse-temurin:11-jre
ARG JAR_FILE=target/it-services-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
