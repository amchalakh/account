package com.technotron.internetbanking.account.services;

import java.util.List;

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

	@Override
	public List<Account> getAllAccount() {
		
		List<Account> accounts = accountDao.getAllAccount();
		return accounts;
	}

	@Override
	public Account getAccount(int id) {
		Account account = accountDao.getAccount(id);
		return account;
	}

}
