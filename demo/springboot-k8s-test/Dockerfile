FROM openjdk:17-alpine
EXPOSE 9090
ADD target/app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]