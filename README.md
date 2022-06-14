# java-restapi-hello-world
Example repository for hello world of a rest api made in java

## Requirements
* [OpenJDK11+](https://adoptopenjdk.net/)
* [Gradle7+](https://gradle.org/install/)
* [Docker](https://www.docker.com/products/docker-desktop/)

## Alternative requirements
* Docker image __gradle:jdk11__

## Compilation

```
gradle clean build
```

### Compilation Docker

```
docker run --rm -u gradle -v "$PWD":/home/gradle/project -w /home/gradle/project gradle:jdk11 gradle clean build

```


### Server
```
server.port=8888
```