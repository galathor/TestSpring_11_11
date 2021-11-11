FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} test-spring.jar
ENTRYPOINT ["java","-jar","/test-spring.jar"]