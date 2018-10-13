FROM openjdk:8u171-jdk-alpine
COPY Hello.java /opt/
WORKDIR /opt/
RUN javac Hello.java
CMD ["java", "-cp", ".", "Hello"]
