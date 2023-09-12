package com.org;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
@RequestMapping("/lode")
public ModelAndView loadEmp() {
	Employee e=new Employee();
	e.setEid(101);
	e.setEname("millar");
	e.setEsal(40000000);
	
	ModelAndView mav=new ModelAndView("emp");
	mav.addObject("emp", e);
	
	return mav;
	
}
@RequestMapping("/read")
public ModelAndView getEmp() {
	Employee e1=new Employee();
	e1.setEid(102);
	e1.setEname("A");
	e1.setEsal(30000000);
	Employee e2=new Employee();
	e2.setEid(103);
	e2.setEname("B");
	e2.setEsal(50000000);
	Employee e3=new Employee();
	e3.setEid(104);
	e3.setEname("C");
	e3.setEsal(60000000);
	
	
	List<Employee> emp7=new ArrayList<Employee>();
	emp7.add(e1);
	emp7.add(e2);
	emp7.add(e3);
	
	
	ModelAndView mav=new ModelAndView("display");
	mav.addObject("emps", emp7);
	
	return mav;
	
}
}
