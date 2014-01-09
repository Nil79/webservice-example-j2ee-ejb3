Web service using EJB3.x
================================


Introduction
-------------------------

This example shows how to implement a Soap Web service with EJB3 and JBoss AS 7.1.1 Final.


Description
-------------------------

The project exposes one simple EJB (EchoWebServiceBean) that implements the remote interface EchoWebService. The interface contains one method that echoes the input string.



Usage
-------------------------

To build the Maven project and deploy use the following command:

	mvn clean package jboss-as:deploy
	
The project references the JBoss AS 7.1.1 Final runtime libraries, so to deploy the project on other application servers change the dependencies in pom.xml file.

I haven't tested with other versions of JBoss AS.

After the project has been deployed, just open your web browser and open the following url:
http://localhost:8080/wsexample/EchoWS/EchoWebServiceBean?wsdl