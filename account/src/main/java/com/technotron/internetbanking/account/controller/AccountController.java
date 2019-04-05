package com.technotron.internetbanking.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technotron.internetbanking.account.dto.Account;
import com.technotron.internetbanking.account.services.AccountService;
import com.technotron.internetbanking.repository.AccountRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired(required = false)
	private AccountService accountService;
	
	
	@PostMapping("/addaccount")
	public HttpStatus addAccount(@RequestBody Account account) {
		System.out.println("Controller:"+account);
		accountService.addAccount(account);
		
		return HttpStatus.CREATED;
		
	}
	
	@RequestMapping("/")
	public String getAccount() {
		return "success";
	}
	
	@GetMapping("/getAllAccount")
	public List<Account> getAllAccount(){
		
		List<Account> accounts = accountService.getAllAccount();
		return accounts;
		
	}

}
