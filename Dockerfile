FROM openjdk:19
COPY target/springboot-backend-2.5.5.jar springboot-backend.jar
ENTRYPOINT ["java", "-jar", "/springboot-backend.jar"]
