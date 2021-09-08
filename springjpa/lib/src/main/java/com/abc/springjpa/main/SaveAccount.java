package com.abc.springjpa.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springjpa.controller.AccountController;
import com.abc.springjpa.entity.Account;

public class SaveAccount {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccno(20);
		account.setName("KKK");
		account.setBalance(60000);
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		AccountController controller = context.getBean(AccountController.class);
		
		controller.addAccount(account);
		System.out.println("Account saved");
		
		context.close();

	}

}
