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

To build the Maven project use the following command:

	mvn clean install
	
Note that it's not necessary to build the project with the dependencies. Otherwise create an EAR package with the needed dependencies (in example using thirdy part libraries).

The project references the JBoss AS 7.1.1 Final runtime libraries, so to deploy the project on other application servers change the dependencies in pom.xml file.

After the project has been deployed, just open your web browser and open the following url:
http://localhost:8080/webservice-example-j2ee-ejb3-1.0-SNAPSHOT/EchoWS/EchoWebServiceBean?wsdl