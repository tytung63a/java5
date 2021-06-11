package io.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.spring.repository.AccountRepository;

public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountRepository accountRepository;
	
	
	
}
