# Docker Deployment and Running Application

## Create Project JAR file:

First clean up the target folder with mvn clean and mvn install.
This command will create a jar file in the target directory of the working directory.

## Create DockerFile:
Docker file is created inside project folder which is used to create Docker images and deploy them in Docker. Following are the steps and their effects.

**FROM java:8** means this is a Java application and will require all the Java librariesk so it will pull all the Java-related libraries and add them to the container.

**EXPOSE 8080** means that we would like to expose 8080 to the outside world to access our application.

**ADD /target/jarName.jar jarName.jar**

**ADD \<source from where Docker should create the image> \<destination>**

**ENTRYPOINT [“java”, “-jar”, “jarName.jar”]** will run the command as the entry point as this is a JAR and we need to run this JAR from within Docker.

## Create and Run Image in Docker Container:

### Craete image in docker with following command
docker build -f Dockerfile -t jarName

### Run docker image using
docker run -p 8080:8080 jarName

