# Drink advisor App with java, Servlets and JSP.
This is the courseware for the Servlet and JSP course.

## System context.
The following diagram explains the context of the project.

![system overview](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/davormz/drink-advisor/main/docs/diagrams/client-server.puml)

## Project setup
### Prerequisites
* [JDK 8 or up](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/download.cgi)

## Installing dependencies
After cloning the project it is necessary to run the following command to get all the dependencies.
```
mvn install
```

### Run it on local
This project uses the jetty plugin to test it on local:
```
mvn jetty:run
```

### Create a project directly from the archetype - From scratch
To start the project completely from scratch execute the maven archetype command:
```
mvn archetype:generate "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-webapp" "-DarchetypeVersion=1.4"
```

And then start adding the required plugins.