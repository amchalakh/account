package com.technotron.internetbanking.account.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technotron.internetbanking.account.dao.AccountDao;
import com.technotron.internetbanking.account.dto.Account;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired(required=false)
	private AccountDao accountDao;
	
	@Override
	public void addAccount(Account account) {
		System.out.println("Service:"+account);
		accountDao.addAccount(account);
		
	}

}
