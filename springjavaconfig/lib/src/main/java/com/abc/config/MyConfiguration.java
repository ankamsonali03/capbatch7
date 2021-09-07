package com.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.bean.Email;
import com.abc.bean.HelloBean;
import com.abc.bean.Message;

@Configuration
public class MyConfiguration {

	@Bean(name = "hello")
	public HelloBean getHelloBean() {
		HelloBean helloBean = new HelloBean();
		helloBean.setMessage("Spring is greate");
		return helloBean;
	}
	
	//DI explicitly
	
	@Bean
	public Message getMessageBean() {
		Message msg = new Message();
		msg.setSubject("module1 results");
		msg.setBody("All are passed");
		return msg;
	}
	
	@Bean
	public Email getEmailBean() {
		Email email = new Email();
		email.setFrom("john@tmail.com");
		email.setTo("abc@tmail.com");
		//email.setMessage(getMessageBean());
		return email;
	}	
	
}
