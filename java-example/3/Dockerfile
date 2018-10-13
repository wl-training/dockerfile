FROM openjdk:8u171-jdk-alpine
COPY Hello.java /opt/
WORKDIR /opt/
RUN javac Hello.java
ENTRYPOINT ["java", "-cp", ".", "Hello"]
