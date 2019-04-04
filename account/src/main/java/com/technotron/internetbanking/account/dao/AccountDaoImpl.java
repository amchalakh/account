package com.technotron.internetbanking.account.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.technotron.internetbanking.account.dto.Account;
import com.technotron.internetbanking.repository.AccountRepository;

@Repository
public class AccountDaoImpl implements AccountDao{

	/*
	 * @Autowired(required = false) private AccountRepository accountRepository;
	 */
	@Autowired(required = false)
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public void addAccount(Account account) {
		/*
		 * Account a = new Account(); a.setAccountHolder(account.getAccountHolder());
		 * a.setBalance(account.getBalance());
		 */
		System.out.println("DAO:"+account);
		this.sessionFactory.getCurrentSession().saveOrUpdate(account);
	//	accountRepository.save(a);
		sessionFactory.close();
		
	}

}
