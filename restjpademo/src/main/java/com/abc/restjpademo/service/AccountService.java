package com.abc.restjpademo.service;

import java.util.List;

import com.abc.restjpademo.entity.Account;

public interface AccountService {
	
	public void saveAccount(Account account);
	
	public Account fetchAccoutByAccno(int accno);
	
	public List<Account> fetchAccountsByName(String name);
	
	public List<Account> fetchAllAccounts();
	
	public void updateAccount(Account account);
	
	public void deleteAccount(int accno);

}
