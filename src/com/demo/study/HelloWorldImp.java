package com.demo.study;

import javax.jws.WebService;

@WebService(endpointInterface ="com.demo.study.HelloWorld")
public class HelloWorldImp implements HelloWorld{

	

	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		return "Hello World JAX-WS "+name;
	}
}
