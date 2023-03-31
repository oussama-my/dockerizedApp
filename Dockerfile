FROM openjdk:19
COPY target/springboot-backend-0.0.1-SNAPSHOT.jar springboot-backend.jar
ENTRYPOINT ["java", "-jar", "/springboot-backend.jar"]
