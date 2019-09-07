FROM openjdk:8
EXPOSE 9090
ADD target/EmployeeAttendance.jar EmployeeAttendance.jar
ENTRYPOINT ["java","-jar","/EmployeeAttendance.jar"]