package com.abc.restjpademo.exception;

public class AccountNotExistingException extends RuntimeException {
	
	public AccountNotExistingException() {
		
	}

	public AccountNotExistingException(String message) {
		super(message);
	}
}
