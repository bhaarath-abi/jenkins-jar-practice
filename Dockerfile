FROM amazoncorretto:17

WORKDIR /app

COPY HelloWorld.jar .

EXPOSE 8090

CMD ["java", "-cp", "HelloWorld.jar", "HelloWorld"]
