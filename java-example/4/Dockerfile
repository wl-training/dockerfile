FROM openjdk:8u171-jdk-alpine
COPY Hello.java /opt/
WORKDIR /opt/
RUN javac Hello.java
ADD init.sh /opt/
ENV VERSION 1.0
ENTRYPOINT ["./init.sh"]
