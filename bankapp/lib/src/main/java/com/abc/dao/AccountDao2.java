package com.abc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.entity.Account;

public class AccountDao2 {
	
	public void saveAccount(Account account) {		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();//insertion, deletion and updation we need txn.
		txn.begin();
		em.persist(account); 
		txn.commit();	
		
		em.close();
		emf.close();		
	}
	
	public Account fetchAccountById(int accno) { 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, accno);		
		em.close();
		emf.close();	
		
		return account;
	}
	
    public boolean deleteAccount(int accno) { 
		boolean isDeleted = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, accno);
		
		if(account!=null) {
			em.getTransaction().begin();
			em.remove(account);
			em.getTransaction().commit();
			isDeleted = true;
		}	
		
		em.close();
		emf.close();	
		
	   return isDeleted;
	}
    
    public Account updateAccount(Account account) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Account updatedAccount =em.merge(account);
		em.getTransaction().commit();
		
		em.close();
		emf.close();	
		
		return updatedAccount;
		
    }


}
