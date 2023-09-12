package com.org;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class DeleteDoctor extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {
     String id=req.getParameter("id");
     String sql="DELETE FROM doctor WHERE id="+id;
     
     try
     {
    Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anu","root","root");
      Statement st=con.createStatement();
      st.execute(sql);
      con.close();
     }
     catch(ClassNotFoundException e)
     {
    e.printStackTrace();
     } catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
     RequestDispatcher rd=req.getRequestDispatcher("displaydoctor.jsp");
     
     rd.include(req, resp);
     

   }
}
