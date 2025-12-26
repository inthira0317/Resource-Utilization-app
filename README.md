#Resource Utilization Assessment of Microservices in Docker and Virtual Machines
📘 Project Overview

This project analyzes how a microservices-based application behaves in two deployment environments:

🐳 Docker Containers

🖥️ Hyper-V Virtual Machines

The goal is to compare CPU, Memory, Disk I/O, and Network usage when running the same microservice under varying loads. A Spring Boot–based Currency Converter microservice is used as the test case, with Apache JMeter generating HTTP requests to simulate 100–1000 concurrent users.

This study helps estimate resource requirements, identify bottlenecks, and understand how containerization and virtualization differ in efficiency and scalability.

🎯 Objectives

Evaluate microservice performance in Docker and VM environments.
Measure resource utilization under load (CPU, RAM, I/O).
Compare scalability and overhead between containers and VMs.
Analyze response behavior using JMeter load testing.
Provide insights for production-grade deployment and resource allocation.
_______________________________________________________
| Category            | Tools / Technologies           |
| ------------------- | ------------------------------ |
| Backend             | Spring Boot (Java)             |
| Containerization    | Docker                         |
| Virtualization      | Hyper-V (Windows 11)           |
| Performance Testing | Apache JMeter                  |
| Monitoring          | Docker Stats, Process Explorer |
| Build Tool          | Maven                          |
| OS                  | Windows 11                     |
_______________________________________________________

🔍 System Analysis
✔ Containerization (Docker)

Docker packages the microservice and its dependencies into a lightweight, portable container.
Benefits include:
Fast deployment
Lower overhead
Consistent runtime environment

✔ Virtualization (Hyper-V)

A Hyper-V VM runs a full operating system, offering complete isolation.
Characteristics:
Strong OS-level isolation
Higher resource usage
Slower compared to containers

✔ Currency Converter Microservice

The application provides the following functions:
Convert values between currencies
Retrieve exchange rates
Display supported currencies
Store/update exchange values

✅ Key Commands Used in the Project
🔧 Maven Commands
mvn clean install
mvn package
mvn dependency:tree
mvn spring-boot:run

☕ Java Commands
java -jar target/currencyconverter-0.0.1-SNAPSHOT.jar
java -jar currencyconverter-0.0.1-SNAPSHOT.jar

🐳 Docker Commands
docker build -t currencyconverterapp .
docker images
docker run -d --name currencyconverter -p 8080:8080 currencyconverterapp
docker stats

🌐 JMeter Commands (inside Dockerfile CMD)
jmeter -n -t /opt/jmeter/bin/100requests.jmx -l /opt/jmeter/results/results.csv


