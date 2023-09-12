package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GirlDriver {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
	Girl gs=ac.getBean("girl",Girl.class);
	System.out.println(gs);
	System.out.println(gs.ic);
}
}
