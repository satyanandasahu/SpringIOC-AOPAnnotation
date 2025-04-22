package com.spring.example.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("savingAccount")
@Scope("prototype")
public class SavingAccount extends Account {

	public final String account = "SavingAccount";
	
}
