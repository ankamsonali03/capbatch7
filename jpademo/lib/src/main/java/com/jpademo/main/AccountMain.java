package com.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpademo.entity.Account;

public class AccountMain {

	public static void main(String[] args) {
		
		int accno = 5;
		
		String name = "Krish";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, accno);
		
		if(account != null) {
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}
		else {
			System.out.println("A/c not exisinting");
		}
		
		em.close();
		emf.close();

	}

}
