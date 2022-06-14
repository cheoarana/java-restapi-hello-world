FROM openjdk:11-jre-slim
ENV TZ=America/Guayaquil
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ARG JAR_FILE=build/libs/java-restapi-hello-world-0.0.1-SNAPSHOT.jar
RUN mkdir /opt/hello-app
WORKDIR /opt/hello-app
COPY ${JAR_FILE} /opt/hello-app/app.jar
COPY run.sh /opt/hello-app/run.sh
CMD ["/bin/sh", "run.sh"]