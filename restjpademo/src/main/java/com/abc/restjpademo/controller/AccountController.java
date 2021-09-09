package com.abc.restjpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.restjpademo.entity.Account;
import com.abc.restjpademo.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/save")
	public String saveAccount(@RequestBody Account account) {
		accountService.saveAccount(account);
		return "Account saved successfully with accno = " + account.getAccno();
	}
	
	@GetMapping("/get/{id}")
	public Account getAccountDetails(@PathVariable("id") int accno) {
		Account account = accountService.fetchAccoutByAccno(accno);
		return account;
	}
	
	@GetMapping("/all")
	public List<Account> getAllAccounts() {
		List<Account> accounts = accountService.fetchAllAccounts();
		return accounts;
	}

}
