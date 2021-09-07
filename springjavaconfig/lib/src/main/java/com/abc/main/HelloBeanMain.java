package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.bean.HelloBean;
import com.abc.config.MyConfiguration;

public class HelloBeanMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		HelloBean helloBean = (HelloBean) context.getBean("hello");
		
		helloBean.printMessage();

	}

}
