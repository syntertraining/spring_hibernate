package com.mypkg.spring.model;
 import com.mypkg.spring.aspect.*;
public class Employee {
	private String name;

	public String getName() {
		return name;
	}
@Loggable
	public void setName(String name) {
		this.name = name;
	}
	public void throwException(){
		throw new RuntimeException();
	}
}
