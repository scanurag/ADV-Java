package com.org;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/myserv")
public class MyServletjsp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String name=req.getParameter("name");
        String gen=req.getParameter("gan");
        
        HttpSession hs=req.getSession();
        hs.setAttribute("n", name);
        hs.setAttribute("n", name);
        RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
        rd.forward(req, resp);
        		
	}
}