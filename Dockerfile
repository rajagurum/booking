#FROM maven:3.5-jdk-11 as BUILD_DIR
#RUN mkdir -p /root/.m2 && mkdir /root/.m2/repository
##COPY settings.xml /root/.m2
#COPY pom.xml /project/
#COPY src /project/src/
#WORKDIR /project/
#RUN mvn clean package -Dmaven.wagon.http.ssl.insecure=true

FROM openjdk:11
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8182
