FROM java:8
ADD /target/freeproject-1.0.0.jar freeproject.jar
ENTRYPOINT ["java","-jar","freeproject.jar"]
