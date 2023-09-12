<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    <%@ page import="java.sql.*" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

    <%

      ResultSet rs=null;

    try{

    	Class.forName("com.mysql.cj.jdbc.Driver");

    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anu","root","root");

        String sql="SELECT * FROM doctor"; 

    	Statement st=con.createStatement();

    	rs=st.executeQuery(sql);

    }

    catch(Exception e)

    {

    	e.printStackTrace();

    }

    %>

    <table border="2px">

    <tr>

       <th>ID</th>

       <th>NAME</th>

       <th>AGE</th>

       <th>PHONE</th>

       <th>SPAC</th>

       <th>EDIT</th>

       <th>DELETE</th>

    </tr> 

    <%

       while(rs.next())

       {

    %> 

    <tr>

       <td><%=rs.getInt(1) %></td>

       <td><%=rs.getString(2) %></td>

       <td><%=rs.getInt(3) %></td>

       <td><%=rs.getLong(4) %></td>

       <td><%=rs.getString(5) %></td>

      <td><a href="edit?id=<%=rs.getInt(1) %>">edit</a> </td> 

      <td><a href="delete?id=<%=rs.getInt(1) %>">delete</a></td>

    </tr> 

    <% } %>

    

    </table>

</body>

</html>

