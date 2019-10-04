# Getting Started

 mvn clean compile install -DskipTest=true && 
 docker build -f Dockerfile -t freeproject .
 && docker run -p 9090:8080 freeproject
 
#Browser url address

 http://localhost:9090/freeProject/swagger-ui.html

