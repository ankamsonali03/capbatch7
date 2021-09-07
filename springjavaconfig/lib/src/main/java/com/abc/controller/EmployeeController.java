package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.bean.Employee;
import com.abc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;	
	
	public void createEmployee() {
		
		Employee emp = empService.saveEmployee();
		
		System.out.println("Employee Saved successfully");
		
		System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary());
		
	}
}
