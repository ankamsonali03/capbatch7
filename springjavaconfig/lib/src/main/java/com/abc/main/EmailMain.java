package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.bean.Email;
import com.abc.config.MyConfiguration;

public class EmailMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Email email = context.getBean(Email.class);
		
		email.sendEmail();	

	}

}
