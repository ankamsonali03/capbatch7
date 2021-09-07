package com.abc.bean;

public class HelloBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Message: "+message);
	}
}
