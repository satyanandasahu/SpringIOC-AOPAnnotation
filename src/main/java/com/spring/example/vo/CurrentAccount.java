package com.spring.example.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CurrentAccount extends Account {

	public final String account = "CurrentAccount"; 
	

}
