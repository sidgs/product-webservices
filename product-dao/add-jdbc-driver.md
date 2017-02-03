## Download 
Go to oracle.com 
Download the jdbc thin driver 
## Install the Driver 
```
mvn install:install-file -Dfile={Path/to/your/ojdbc.jar} -DgroupId=com.oracle
-DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
```

## Add dependence to pom

- Group ID: com.oracle 
- artifactid: ojdbc6
- version=11.2.0
