package com.abc.dao;

import com.abc.bean.Employee;

public class EmployeeDao {
	
	public Employee addEmployee() {
		Employee emp1 = new Employee();
		emp1.setEmpId(111);
		emp1.setName("raj");
		emp1.setSalary(50000);
		return emp1;
	}
}
