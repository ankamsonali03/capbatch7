package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.config.MyConfiguration2;
import com.abc.controller.EmployeeController;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration2.class);
		
		EmployeeController controller = context.getBean(EmployeeController.class);
		
		controller.createEmployee();
		
	}

}
