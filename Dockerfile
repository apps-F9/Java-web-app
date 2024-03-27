# Use a base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/webapp-0.0.1-SNAPSHOT.jar /app/webapp-0.0.1-SNAPSHOT.jar

# Command to run the Java application
CMD ["java", "-jar", "webapp-0.0.1-SNAPSHOT.jar"]
