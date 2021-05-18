FROM openjdk:11-jre-slim
ARG JAR_FILE=build/libs/flyway.jar
COPY run.sh .
COPY ${JAR_FILE} flyway.jar
ENTRYPOINT ["bash", "run.sh"]