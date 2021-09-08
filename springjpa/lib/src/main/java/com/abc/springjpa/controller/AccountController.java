package com.abc.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.springjpa.entity.Account;
import com.abc.springjpa.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	public void addAccount(Account account) {
		
		accountService.saveAccount(account);
	}

}
