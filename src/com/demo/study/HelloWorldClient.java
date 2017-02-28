package com.demo.study;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://localhost:7779/ws/hello?wsdl");
		
		QName qName = new QName("http://study.demo.com/","HelloWorldImpService");
		
		Service service = Service.create(url,qName);
		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("Sumit"));

	}

}
