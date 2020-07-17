FROM openjdk:8
ADD target/docker-app-image.jar docker-app-image.jar
EXPOSE 9191
ENTRYPOINT ["java","-jar","/docker-app-image.jar"]