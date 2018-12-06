FROM openjdk:8-jre-alpine

COPY . /usr/src/demo
WORKDIR /usr/src/demo

RUN pwd
RUN ls -l

EXPOSE 8181

# launch application
CMD java -jar target/demo-0.0.1.jar
