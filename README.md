 Create your own Dockerfile
============================
Step 1
------
* the folder python-example contains a simple Dockerfile + a one-liner python file
* start with building an image from python-example. give it a meaningful name.
* run that image and make sure that you see the expected "Hello World" output

Step 2
------
* let's do something similar but now with Java instead of Python!
* one advantage of Docker is that you can package everything in one container - no need to ship the JDK separately!
* cd to the folder java-example and create your new Dockerfile there
  * you can use openjdk:8u171-jdk-alpine as a base image (~105 MB, already contains the JDK)
  * add the Hello.java file to the image and make sure the file is compiled by java (using javac command)
  * define a CMD at the end. the compiled class should be called when running the container ('java -cp . Hello' will work) 
  * verify that it works with a new container
* HINT: you can of course create your Dockerfile line-by-line and also run the intermediate steps as a container (interactive mode with /bin/sh)

Step 3
------
* change the Hello.java file slightly, so that the parameters (args) are printed out to the console
* use ENTRYPOINT instead of CMD now in your Dockerfile, so that you can hand over the arguments with docker
* rebuild the image and test with new containers

Step 4 (for quick people!)
-------------------------
* it's often useful to use a startup script (e.g. shell script) instead of a hardcoded format/entrypoint
* you can then still change things/do migrations before the actual container process starts
* add an ENV instruction in your Dockerfile and create a script that outputs this variable before starting the java process
* verify that you can also change the script/env-variable in a existing container (e.g. using 'docker cp')


HINT: There's also a solution-branch, but don't look too early! :)
