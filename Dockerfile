FROM openjdk:17

ADD target/Doctor-1-0.0.1-SNAPSHOT.jar Doctor-1-0.0.1-SNAPSHOT.jar
CMD ["java","-jar", "Doctor-1-0.0.1-SNAPSHOT.jar"]