FROM openjdk:8-jre-alpine

COPY ./target/demo-0.0.1.jar /usr/src/demo/target/demo-0.0.1.jar
WORKDIR /usr/src/demo/target

RUN pwd
RUN ls -l

EXPOSE 8080

# launch application
CMD java -jar demo-0.0.1.jar
