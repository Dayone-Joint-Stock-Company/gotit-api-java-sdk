# Use Maven image for building
FROM maven:3.8.6-openjdk-8 AS build

# Set working directory
WORKDIR /app

# Install git
RUN apt-get update && apt-get install -y git

# Clone the SDK repository
RUN git clone https://github.com/Dayone-Joint-Stock-Company/gotit-api-java-sdk.git /app/gotit-api-java-sdk

# Build and install SDK
WORKDIR /app/gotit-api-java-sdk
RUN mvn clean install -DskipTests

# Copy main application files
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build main application
RUN mvn clean package

# Create runtime image
FROM openjdk:8-jre-slim

# Set working directory
WORKDIR /app

# Copy built JAR from build stage
COPY --from=build /app/target/hello-world-app-1.0-SNAPSHOT-jar-with-dependencies.jar /app/hello-world.jar

# Run the application
CMD ["java", "-jar", "hello-world.jar"] 