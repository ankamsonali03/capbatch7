package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.bean.Account;
import com.abc.service.AccoutService;

@Controller
public class AccountController {

	@Autowired
	private AccoutService accountService;
	
	public void addAccount(Account account) {
		
		accountService.saveAccount(account);
	}
}
