FROM openjdk:8
EXPOSE 8080
RUN apt-get update && \
    apt-get install -y openjdk-17-jre
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]
