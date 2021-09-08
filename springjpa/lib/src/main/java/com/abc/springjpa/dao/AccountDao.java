package com.abc.springjpa.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.abc.springjpa.entity.Account;

@Repository
public class AccountDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Account account) {
		
		entityManager.persist(account);
	}
}
