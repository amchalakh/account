package com.technotron.internetbanking.repository;



import org.springframework.data.repository.CrudRepository;


import com.technotron.internetbanking.account.dto.Account;


public interface AccountRepository extends CrudRepository<Account, Integer>{

}
