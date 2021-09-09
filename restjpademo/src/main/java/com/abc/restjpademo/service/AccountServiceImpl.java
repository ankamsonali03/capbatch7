package com.abc.restjpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.restjpademo.entity.Account;
import com.abc.restjpademo.exception.AccountNotExistingException;
import com.abc.restjpademo.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void saveAccount(Account account) {		
		accountRepository.save(account);		
	}

	@Override
	public Account fetchAccoutByAccno(int accno) throws AccountNotExistingException {	
		
		Optional<Account> optionalAccount = accountRepository.findById(accno);		
		if(optionalAccount.isEmpty()) {			
			throw new AccountNotExistingException("Account is not existing with id: "+accno);			
		}
		Account account = optionalAccount.get();		
		return account;
	}

	@Override
	public List<Account> fetchAllAccounts() {	
		List<Account> accountList = accountRepository.findAll();
		return accountList;
	}

	@Override
	public void updateAccount(Account account) {
		
		accountRepository.save(account);
		
	}

	@Override
	public void deleteAccount(int accno) {
		
		accountRepository.deleteById(accno);
		
	}

	@Override
	public List<Account> fetchAccountsByName(String name) {
		
		return accountRepository.findByName(name);
	}

}
