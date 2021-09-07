package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.bean.Employee;
import com.abc.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;		
	
	public Employee saveEmployee() {
		//validation logic goes here
		Employee emp = empDao.addEmployee();
		return emp;
	}
}
