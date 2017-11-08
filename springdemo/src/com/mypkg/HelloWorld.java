package com.mypkg;

public class HelloWorld {
	private String message;

	

	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage(){
		System.out.println("Your Message :"+message);
	}
	public void init(){
		System.out.println("Initializing the bean");
	}
	public void destroy(){
		System.out.println("object is destroyed");
	}
}
