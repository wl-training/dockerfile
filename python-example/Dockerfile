# Example Dockerfile
FROM ubuntu
MAINTAINER Sven Kammerer "sven.kammerer@worldline.com"

RUN apt-get update
RUN apt-get install -y python
ADD hello.py /home/hello.py
WORKDIR /home
CMD ["python", "hello.py"]
