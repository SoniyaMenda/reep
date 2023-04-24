FROM openjdk:17

EXPOSE 8090
COPY /target/*.jar test.jar

ENTRYPOINT ["java","-jar","test.jar"]
