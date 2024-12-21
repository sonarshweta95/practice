FROM openjdk:latest

# Set the working directory to /app
WORKDIR /App

# Copy the Java application into the container
COPY . /App

RUN javac HelloWorld.java


# Run the command to start the Java application when the container launches
CMD ["java", "HelloWorld"]