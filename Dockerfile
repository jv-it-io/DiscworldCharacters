FROM openjdk:11-jdk-buster

WORKDIR /app
COPY ./target/DiscWorldCharacter-0.0.1-SNAPSHOT.jar /app

EXPOSE 8196
EXPOSE 27017

CMD ["java", "-jar","-Dspring.profiles.active=docker", "DiscWorldCharacter-0.0.1-SNAPSHOT.jar"]