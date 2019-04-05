package com.technotron.internetbanking.account.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.technotron.internetbanking.account.dto.Account;
import com.technotron.internetbanking.repository.AccountRepository;

@Repository
public class AccountDaoImpl implements AccountDao {

	/*
	 * @Autowired(required = false) private AccountRepository accountRepository;
	 */

	@Autowired(required = false)
	private SessionFactory sessionFactory;

	@Override
	public void addAccount(Account account) {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		System.out.println("DAO:" + account);
		try {
			session.save(account);
			session.getTransaction().commit();
			// accountRepository.save(account);
			// sessionFactory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * @Override public List<Account> getAllAccount() {
	 * 
	 * List<Account> accounts = session.createCriteria(Account.class).list(); return
	 * accounts; }
	 */

}
