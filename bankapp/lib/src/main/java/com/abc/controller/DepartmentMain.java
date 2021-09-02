package com.abc.controller;

import java.util.HashSet;
import java.util.Set;

import com.abc.dao.DepartmentDao;
import com.abc.entity.Department;
import com.abc.entity.Employee;

public class DepartmentMain {

	public static void main(String[] args) {
		
		Department dept = new Department();
		dept.setDeptId(10);
		dept.setDeptName("IT");
		
		Employee emp1 = new Employee();
		emp1.setEmpNo(111);
		emp1.setName("aaa");
		emp1.setSalary(50000);
		emp1.setDept(dept);
		
		Employee emp2 = new Employee();
		emp2.setEmpNo(222);
		emp2.setName("bbb");
		emp2.setSalary(50000);
		emp2.setDept(dept);
		
		Employee emp3 = new Employee();
		emp3.setEmpNo(333);
		emp3.setName("ccc");
		emp3.setSalary(60000);
		emp3.setDept(dept);
		
		Set<Employee> employees = new HashSet<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);			
		
		dept.setEmployees(employees);
		
		DepartmentDao deptDao = new DepartmentDao();
		deptDao.saveDepartment(dept);
		System.out.println("dept saved.");

	}

}
