package com.abc.controller;

import java.time.LocalDate;

import com.abc.dao.AccountDao2;
import com.abc.entity.Account;

public class AccountMain2 {

	public static void main(String[] args) {
		
		AccountDao2 accountDao2 = new AccountDao2();	
		
		//********Save*******************//
		
//		Account account = new Account();
//		account.setAccno(3333);
//		account.setName("Krish");
//		account.setBalance(55000);
//		account.setOpeningDate(LocalDate.of(2020, 12, 20));		
//			
//		accountDao2.saveAccount(account);
//		System.out.println("Account saved.");
		
		//********Fetch*******************//
		
//		Account account = accountDao2.fetchAccountById(4444);
//		
//		if(account!=null) {
//			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance()+" "+account.getOpeningDate());
//		}
//		else {
//			System.out.println("A/c not existing.");
//		}	
		
		//********Delete*******************//
		
		int accno = 222;
		boolean isDeleted = accountDao2.deleteAccount(accno);
		if(isDeleted) {
			System.out.println("Account deleted");
		}
		else {
			System.out.println("Account not exsting");
		}
		
		//********Update*******************//
		
		Account account1 = new Account();
		account1.setAccno(1111);
		account1.setName("Krish");
		account1.setBalance(40000);
		account1.setOpeningDate(LocalDate.of(2010, 01, 01));
		
		Account updatedAccount = accountDao2.updateAccount(account1);
		System.out.println("A/c updated.");
		System.out.println("A/c no: "+updatedAccount.getAccno());
		System.out.println("Name: "+updatedAccount.getName());
		System.out.println("Balance: "+updatedAccount.getBalance());
		System.out.println("Opening Date: "+updatedAccount.getOpeningDate());
		

	}

}
