FROM openjdk:8-jdk-stretch
RUN mkdir -p /usr/local/myapp
ADD docker/app/*.jar /usr/local/myapp
CMD ["java","-jar","/usr/local/myapp/spring-boot-maven-1.0.0-SNAPSHOT.jar"]
