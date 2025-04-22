package com.spring.example.service;

import org.springframework.stereotype.Component;

import com.spring.example.vo.Account;


@Component
public class AccountServDAO implements IAccountServiceDAO {

	
	public void transfer(Account fromAccount, Account toAccount, Long amount) {
		System.out.println(this.getClass().getName());
		System.out.println(amount + " tranfered from " 
					+ fromAccount.getAccountNumber() + " to " 
					+ toAccount.getAccountNumber());
	}

	public Double checkBalance(Account account) {
		System.out.println("Available balance: 100000");
		return Double.valueOf(100000);
	}

	public Long withdrawal(Account account, Long amount) {
		System.out.println("Withdrawn : " + amount);
		return amount;
	}
	
	public void deposit(Account account, Long amount) {
		System.out.println(amount + " has been deposited to " + account.getAccountNumber());
	}
}
