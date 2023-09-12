package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/msg")
	public String getMsg() {
		return "msg";
	}
	@RequestMapping("/msg1")
	public ModelAndView getMsg1() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("msg1");
		return mav;
		
	}

}