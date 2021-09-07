package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.bean.Account;
import com.abc.dao.AccountDao;

@Service
public class AccoutService {

	@Autowired
	private AccountDao accountDao;
	
	public void saveAccount(Account account) {
		
		accountDao.save(account);
	}
}
