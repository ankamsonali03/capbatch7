package com.abc.restjpademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.restjpademo.entity.Account;


public interface AccountRepository extends JpaRepository<Account,Integer> {

	
	public List<Account> findByName(String name);
}
