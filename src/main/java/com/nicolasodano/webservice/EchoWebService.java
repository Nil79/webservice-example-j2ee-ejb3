package com.nicolasodano.webservice;

import javax.ejb.Remote;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Remote
@WebService
@SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.DOCUMENT
            ,use = javax.jws.soap.SOAPBinding.Use.LITERAL
            ,parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED)
public interface EchoWebService {
	public String echo(String s);
}
