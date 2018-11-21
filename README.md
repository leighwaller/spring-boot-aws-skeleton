## Spring Boot AWS Skeleton

#### About
This repository contains a starter project for a spring boot micro service.
It is built using maven and designed to be deployed using docker.

It includes the following:
* Basic project structure 
* Maven dependencies for spring boot, spring cloud aws, and testing
* Build specs for AWS CodeBuild
* Docker file to create an image of this service

#### Usage

##### Execute tests and package an artifact
This will compile the source, run unit tests, run integration tests and package a jar file.
You should also get some nice build reports.
```
mvn clean verify
```

##### Start the service
For fast manual testing on a local machine, you can start the application as follows.
```
mvn spring-boot:run
```

##### Building the Docker image
First package the jar if you haven't already
```
mvn clean verify
```

```
SERVICE_NAME=spring-boot-aws-skeleton
docker build --build-args=target/$SERVICE_NAME-*.jar -t $SERVICE_NAME .
```
