FROM openjdk:11

WORKDIR "/taaproject"

EXPOSE 8080

COPY target/taaproject-0.0.1-SNAPSHOT.jar ./

CMD ["java", "-jar", "taaproject-0.0.1-SNAPSHOT.jar"]
