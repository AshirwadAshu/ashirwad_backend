package com.excel.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samosa {
	
	public void display() {
		System.out.println("my price is high!");
	}


}
