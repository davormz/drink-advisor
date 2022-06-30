# My To-Do list with java, Servlets and JSP.
This is the courseware for the Servlet and JSP course.

## Project setup
### Prerequisites
* JDK
* Maven

### Run it on local
This project uses the jetty plugin to test it on local:
```
mvn jetty:run
```

### From scratch
To start the project completely from scratch execute the maven archetype command:
```
mvn archetype:generate "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-webapp" "-DarchetypeVersion=1.4"
```