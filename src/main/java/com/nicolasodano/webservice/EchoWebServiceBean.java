package com.nicolasodano.webservice;

import java.rmi.RemoteException;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "com.nicolasodano.webservice.EchoWebService",serviceName="EchoWS")
public class EchoWebServiceBean implements EchoWebService {
	
	/**
	 * Echoes the input string
	 * @param String s
	 */
	public String echo(String s) {
	    return "ECHO: "+s.toUpperCase();
	 }
}
