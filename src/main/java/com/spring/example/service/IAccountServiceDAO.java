package com.spring.example.service;

import com.spring.example.vo.Account;


public interface IAccountServiceDAO {

	public void transfer(Account fromAccount, Account toAccount, Long amount);

	public Double checkBalance(Account account);

	public Long withdrawal(Account account, Long amount);

	public void deposit(Account account, Long amount);
}
