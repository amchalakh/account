package com.technotron.internetbanking.account.services;

import java.util.List;

import com.technotron.internetbanking.account.dto.Account;

public interface AccountService {
	
	public void addAccount(Account account);
	public List<Account> getAllAccount();
	public Account getAccount(int id);

}
