package com.technotron.internetbanking.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.technotron.internetbanking.account.dto.Account;


public interface AccountRepository extends JpaRepository<Account, Integer>{

}
