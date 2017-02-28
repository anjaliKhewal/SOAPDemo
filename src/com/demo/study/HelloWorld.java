package com.demo.study;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService	
@SOAPBinding()
public interface HelloWorld {
	
	@WebMethod
	String getHelloWorldAsString(String name);
	
}
