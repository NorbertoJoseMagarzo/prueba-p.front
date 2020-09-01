FROM openjdk:12-jdk-alpine

ARG JAR_FILE=target/tablero-control-rrhh-0.0.1-SNAPSHOT.jar
COPY  ${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
EXPOSE 8081
