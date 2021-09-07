package com.abc.dao;

import org.springframework.stereotype.Repository;

import com.abc.bean.Employee;

@Repository
public class EmployeeDao {
	
	public Employee addEmployee() {
		Employee emp1 = new Employee();
		emp1.setEmpId(111);
		emp1.setName("raj");
		emp1.setSalary(50000);
		return emp1;
	}
}
