<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String x=request.getParameter("x");
String y=request.getParameter("y");

System.out.println(x);
System.out.println(y);

%>
</body>
</html>