package com.abc.controller;

import java.util.Set;

import com.abc.dao.DepartmentDao;
import com.abc.entity.Department;
import com.abc.entity.Employee;

public class DepartmentMain2 {

	public static void main(String[] args) {
		
		//fetching dept details.
		
		DepartmentDao deptDao = new DepartmentDao();
		
		int deptId = 10;
		
		Department dept = deptDao.fetchDepartmentById(deptId);
		
		if(dept!=null) {
			System.out.println("Dept No: "+dept.getDeptId());
			System.out.println("Dept Name: "+dept.getDeptName());			
		}
		else {
			System.out.println("Dept Not exising");
		}
		
//		System.out.println("Employees working in this dept");
//		
//		Set<Employee> emps = dept.getEmployees();
//		emps.forEach(e-> System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary()));

	}

}
