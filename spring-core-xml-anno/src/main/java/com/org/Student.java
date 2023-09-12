package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("std")
public class Student {
int roll;
String name;
     public Student(@Value("1")int roll,@Value("sarath")String name) {
    	 this.roll=roll;
    	 this.name=name;
     }
}
