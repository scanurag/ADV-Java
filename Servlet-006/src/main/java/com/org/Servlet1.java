package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String name=req.getParameter("name");
	    System.out.println(name);
	    PrintWriter pw=resp.getWriter();
	    pw.write("<html><body>");
	    pw.write("<form action=s2>");
	    pw.write("<input type=text value='"+name+"' name=n  hidden>");
	    pw.write("<input type=submit> </form></body></html>");
	    
	}
}
