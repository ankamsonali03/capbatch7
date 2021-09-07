package com.abc.service;

import com.abc.bean.Employee;
import com.abc.dao.EmployeeDao;

public class EmployeeService {
	
	private EmployeeDao empDao;	

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	public Employee saveEmployee() {
		//validation logic goes here
		Employee emp = empDao.addEmployee();
		return emp;
	}
}
