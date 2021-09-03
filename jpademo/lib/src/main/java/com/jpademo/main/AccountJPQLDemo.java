package com.jpademo.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpademo.entity.Account;

public class AccountJPQLDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("*****Select All Accounts*****");
		
		Query query1 = em.createQuery("select a from Account a");
		List<Account> accounts = query1.getResultList();		
		accounts.forEach(acc -> System.out.println(acc.getAccno()+ " "+acc.getName()+" "+acc.getBalance()));
		
		System.out.println("*****Select Account by name (using positional parameters)*****");
		
		String name = "Raj";
		Query query2 = em.createQuery("select a from Account a where a.name = ?1");
		query2.setParameter(1, name);
		Account account = (Account) query2.getSingleResult();
		System.out.println(account.getAccno()+ " "+account.getName()+" "+account.getBalance());
		
		System.out.println("*****Select Account by name (using named parameters)*****");
		
		String name1 = "Krish";
		Query query3 = em.createQuery("select a from Account a where a.name = :accname");
		query3.setParameter("accname", name1);
		Account account1 = (Account) query3.getSingleResult();
		System.out.println(account1.getAccno()+ " "+account1.getName()+" "+account1.getBalance());
		
		em.close();
		emf.close();

	}

}
