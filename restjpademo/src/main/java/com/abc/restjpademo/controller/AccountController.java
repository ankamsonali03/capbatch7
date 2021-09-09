package com.abc.restjpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.restjpademo.entity.Account;
import com.abc.restjpademo.exception.AccountNotExistingException;
import com.abc.restjpademo.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/save")
	public ResponseEntity<String> saveAccount(@RequestBody Account account) {
		accountService.saveAccount(account);
		return new ResponseEntity<>("Account saved successfully with accno = " + account.getAccno(),
				HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getAccountDetails(@PathVariable("id") int accno) {

		ResponseEntity<Object> respEntity = null;

		try {
			Account account = accountService.fetchAccoutByAccno(accno);
			respEntity = new ResponseEntity<>(account, HttpStatus.OK);
		} catch (AccountNotExistingException e) {
			respEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

		return respEntity;
	}

	@GetMapping("/getbyname/{name}")
	public ResponseEntity<Object> getAccountsByName(@PathVariable("name") String name) {

		ResponseEntity<Object> respEntity = null;

		List<Account> accounts = accountService.fetchAccountsByName(name);
		respEntity = new ResponseEntity<>(accounts, HttpStatus.OK);

		return respEntity;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> accounts = accountService.fetchAllAccounts();
		return new ResponseEntity<>(accounts, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateAccount(@RequestBody Account account) {
		accountService.updateAccount(account);
		return new ResponseEntity<>("A/c updated Successfully.", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable("id") int accno) {
		accountService.deleteAccount(accno);
		return new ResponseEntity<>("A/c deleted Successfully.", HttpStatus.OK);
	}

}
