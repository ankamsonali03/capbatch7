package com.abc.controller;

import com.abc.bean.Employee;
import com.abc.service.EmployeeService;

public class EmployeeController {

	private EmployeeService empService;	
	
	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}
	
	public void createEmployee() {
		
		Employee emp = empService.saveEmployee();
		
		System.out.println("Employee Saved successfully");
		
		System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary());
		
	}
}
