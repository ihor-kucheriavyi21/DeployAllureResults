# Use an official Maven image to build the project with Java 17
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and download the dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the rest of the project
COPY src ./src

# Install dependencies for Selenium (e.g., Chrome and ChromeDriver)
RUN apt-get update && \
    apt-get install -y wget unzip && \
    wget -O /tmp/chromedriver.zip https://chromedriver.storage.googleapis.com/91.0.4472.19/chromedriver_linux64.zip && \
    unzip /tmp/chromedriver.zip -d /usr/local/bin/ && \
    rm /tmp/chromedriver.zip && \
    wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && \
    dpkg -i google-chrome-stable_current_amd64.deb; apt-get -fy install

# Set the environment variable for ChromeDriver
ENV PATH /usr/local/bin:$PATH

# Run Maven command to clean and test, then copy results to GCS bucket
CMD ["sh", "-c", "mvn clean test && gsutil cp -r target/allure-results gs://your-gcs-bucket/allure-results"]
