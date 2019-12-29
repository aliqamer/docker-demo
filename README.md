# docker-demo
a simple rest api running inside docker container

> gradlew build
> docker build -f Dockerfile1 --build-arg JAR_FILE=build/libs/*.jar -t docker/demo .
> docker run -p 8080:8080 docker/demo


Note: use docker ip from docker startup logs
