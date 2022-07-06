# Drink advisor App with java, Servlets and JSP.
This is the courseware for Java Web Programing; Servlets and JSPs course.

## System context.
The following diagram explains the context of the project.

![system overview](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/davormz/drink-advisor/main/docs/diagrams/client-server.puml)

## Project setup
### Prerequisites
* [JDK 8 or up](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/download.cgi)

#### Install JDK on windows.
Follow the steps from the [official site](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-microsoft-windows-platforms.htm).

#### Install JDK on Linux.
Follow the instructions from the [official site](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-linux-platforms.htm).

#### How to install Apache Maven.
Follow the instructions from the [official site](https://maven.apache.org/install.html).

### Installing project dependencies
After cloning the project it is necessary to run the following command to get all the dependencies required for the project.
```
mvn install
```

### Run it on local
Run the following command, to start the jetty server on local.
```
mvn jetty:run
```
Then open your browser and visit http:/localhost:9090 and you should see the web application index page.

### Create a project directly from the archetype - From scratch
This project was created using a maven archetype. To start the project completely from scratch execute the maven archetype command:
```
mvn archetype:generate "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-webapp" "-DarchetypeVersion=1.4"
```

And then start adding the required plugins.