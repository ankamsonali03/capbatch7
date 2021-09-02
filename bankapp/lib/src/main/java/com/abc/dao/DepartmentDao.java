package com.abc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.entity.Department;

public class DepartmentDao {
	
	public void saveDepartment(Department dept) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept);
		//dept.getEmployees().forEach(emp->em.persist(emp));
		em.getTransaction().commit();
		em.close();
		emf.close();	
	}

}
