FROM ubuntu:18.04

EXPOSE 8080
ARG JAR_FILE=./target/Calculator-Devops.jar

RUN 	apt-get update && \
	apt-get -y install openjdk-8-jdk openjdk-8-jre && \
	mkdir ./app
	
WORKDIR /app

COPY $JAR_FILE .

CMD java -cp Calculator-Devops.jar DriverClass
