package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Student s=ac.getBean("std", Student.class);
		System.out.println(s.roll);
		System.out.println(s.name);
	}

}
