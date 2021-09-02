package com.abc.controller;

import java.time.LocalDate;

import com.abc.dao.AccountDao;
import com.abc.dto.Account;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccno(3333);
		account.setName("Raj");
		account.setBalance(65000);
		account.setOpeningDate(LocalDate.of(2020, 12, 20));
		
		AccountDao accountDao = new AccountDao();
		accountDao.saveAccount(account);
		System.out.println("account saved");

	}
}
