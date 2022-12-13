FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY sensor.csv sensor.csv
ENTRYPOINT ["java","-jar","/app.jar"]