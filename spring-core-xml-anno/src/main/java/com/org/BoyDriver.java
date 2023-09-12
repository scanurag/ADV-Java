package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoyDriver {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Boy b=ac.getBean("boy" ,Boy.class);
	System.out.println(b);
	System.out.println(b.j);
}
}
