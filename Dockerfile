FROM openjdk:8
ADD target/EmployeeMSDemo-0.0.1-SNAPSHOT.jar EmployeeMSDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","EmployeeMSDemo-0.0.1-SNAPSHOT.jar"]