#FROM openjdk:8-jre-alpine
#ADD target/studentmanagement-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:8-jre-alpine
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]