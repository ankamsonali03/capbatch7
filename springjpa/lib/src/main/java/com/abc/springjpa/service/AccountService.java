package com.abc.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.springjpa.dao.AccountDao;
import com.abc.springjpa.entity.Account;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Transactional
	public void saveAccount(Account account) {
		
		accountDao.save(account);
	}
	
}
