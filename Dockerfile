FROM openjdk:21-jdk-buster

WORKDIR /app
COPY ./target/DiscWorldCharacter-0.0.2-SNAPSHOT.jar /app

EXPOSE 8196
EXPOSE 27017
EXPOSE 3000
EXPOSE 8086

CMD ["java", "-jar","-Dspring.profiles.active=docker", "DiscWorldCharacter-0.0.2-SNAPSHOT.jar"]