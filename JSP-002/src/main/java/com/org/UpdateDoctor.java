package com.org;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateDoctor extends HttpServlet
{


@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
int id=Integer.parseInt(req.getParameter("id"));
String name=req.getParameter("name");
int age=Integer.parseInt(req.getParameter("age"));
long Phone=Long.parseLong(req.getParameter("Phone"));
String spac=req.getParameter("spac");
int i=0;

try {
Class.forName("com.mysql.cj.jdbc.Driver");
try {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anu","root","root");
String sql="UPDATE doctor SET name=?,age=?,Phone=?,spac=? WHERE id=?";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1, name);
ps.setInt(2, age);
ps.setLong(3, Phone);
ps.setString(4, spac);
ps.setInt(5, id);
i=ps.executeUpdate();
con.close();
} catch (SQLException e) {
e.printStackTrace();
}
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

RequestDispatcher rd=req.getRequestDispatcher("displaydoctor.jsp");
rd.forward(req, resp);


}

}