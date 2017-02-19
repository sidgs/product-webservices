# Introduction 

'Product-WS' is a java module that provides restful web services for NRI Genie

##  Build and Package

Run the below commands 
```
mvn compile 
mvn test 
mvn package 
```

This produces a war file that can be deployed into Servlet Container or an application Server 

## Run App 

### Development Environment 

Command to start the app :
```
mvn -Ddb.username=root -Ddb.password=password -Ddb.host=localhost -Ddb.name=products clean package tomcat7:run-war
```

Note: You will need a MYSQL database to connect . Provide the information below 
db.host = hostname/ip address of the database ( Default: localhost)
db.name = name of the database (default: products)
db.username = username to connect to DB (default: root) 
db.password = password to connect to DB (Default: password) 


This will run the application @ http://localhost:8080/

Testing the member web service
- In a browser open the link 