package com.spring.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.spring.example.service.AccountService;
import com.spring.example.vo.Account;



@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.spring" })
@Component
public class App {

	@Autowired
	private AccountService accountService;

	@Autowired
	@Qualifier("savingAccount")
	private Account fromAccount;

	@Autowired
	@Qualifier("savingAccount")
	private Account toAccount;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(App.class);
		applicationContext.refresh();
		App app = (App) applicationContext.getBean(App.class);
		app.execute();
	}

	public void execute() {

		accountService.getAccount("");

		/* Populating account information */
		fromAccount.setAccountNumber("02384032943");
		toAccount.setAccountNumber("02384032944");

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		accountService.transfer(fromAccount, toAccount, 100000l);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		System.out.println("######################################################################");
		accountService.checkBalance(fromAccount);
		System.out.println("######################################################################");

		accountService.deposit(fromAccount, 100000l);
		accountService.withdrawal(fromAccount, 100000l);
	}
}
