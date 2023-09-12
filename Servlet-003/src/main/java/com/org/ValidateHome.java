package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/logins")
public class ValidateHome extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		if(email.equals("abc@gamil.com")&& password.equals("12345")) {
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
		}
		else {
			PrintWriter pw=res.getWriter();
			String msg="<html> <body> <h1>Login Success </h1> </body> </html> ";
			RequestDispatcher rd=req.getRequestDispatcher("LoginForm.jsp");
			rd.include(req, res);

		}
	}

}
