package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.dao.LoginCRUD;
import com.org.dto.Login;

@Controller
public class LoginController {
@RequestMapping("/anu")
public String loginSave(@ModelAttribute Login l) {
	LoginCRUD.saveLogin(l);
	return "LoginPage.jsp";
}
}
