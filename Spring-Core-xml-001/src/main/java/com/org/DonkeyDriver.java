package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DonkeyDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	}

}
