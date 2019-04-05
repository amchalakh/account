package com.technotron.internetbanking.account.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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

	
	  @Override 
	  public List<Account> getAllAccount() {
		  
		  // Get all entities from table using Criteria Query
		  Session session = sessionFactory.getCurrentSession();
		  CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		  CriteriaQuery<Account> criteriaQuery = criteriaBuilder.createQuery(Account.class);
		  Root<Account> rootEntry = criteriaQuery.from(Account.class);
		  CriteriaQuery<Account> all = criteriaQuery.select(rootEntry);
		  TypedQuery<Account> allQuery = session.createQuery(all);
 
		  return allQuery.getResultList(); 
		  
		/*
		 * Get all entities from table using JPQL return
		 * session.createQuery("SELECT a FROM Account a",
		 * Account.class).getResultList();
		 */
	  
	  }


	@Override
	public Account getAccount(int id) {
		Session session = sessionFactory.getCurrentSession();
		Account account = session.get(Account.class, id);
		return account;
	}
	 

}
