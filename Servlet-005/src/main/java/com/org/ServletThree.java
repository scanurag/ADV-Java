package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sv3")
public class ServletThree extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		 HttpSession hs3=req.getSession();
		String email=(String)hs3.getAttribute("email");
		  String password=(String)hs3.getAttribute("pwd");
		  System.out.println(email);
		  System.out.println(password);
		 

	}
}
