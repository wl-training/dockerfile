Create your own Dockerfile
##########################

Step 1
------
* the folder python-example contains the Dockerfile that we just saw + a one-liner python file
* start with building an image from python-example. give it a meaningful name.
* run that image and make sure that you see the expected output

Step 2
------
* let's do something similar but now with Java instead of Python!
* one advantage of Docker is that you can package everything in one container - no need to ship the JDK separately!
* cd to the folder java-example and create your new Dockerfile there
  * you can use openjdk:8u171-jdk-alpine as a base image (~105 MB, already contains the JDK)
  * add the Hello.java file to the image and make sure the file is compiled by java
  * define that the compiled jar is called when running the container and verify that it works
  * change the content of the output and build the image again. note that Docker does detect what needs to be built and what can be taken from cache

