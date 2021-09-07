package com.abc.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Email {
	
	private String from;
	private String to;
	
	@Autowired
	private Message message;	
	
	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setMessage(Message message) {
		this.message = message;
	}


	public void sendEmail() {
		System.out.println("From: "+from);
		System.out.println("To: "+to);
		System.out.println("Body");
		System.out.println("Subject: "+message.getSubject());
		System.out.println("Message: "+message.getBody());
	}
	

}
