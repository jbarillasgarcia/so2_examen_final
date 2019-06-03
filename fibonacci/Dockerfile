FROM openjdk:8-jre-alpine
EXPOSE 9009
ADD target/fibonacci-0.0.1-SNAPSHOT.jar fibonacci.jar
ENTRYPOINT ["java", "-jar", "fibonacci.jar"]
