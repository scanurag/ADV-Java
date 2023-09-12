<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% HttpSession hs=request.getSession(); %>
<%=hs.getAttribute("n") %>
<%=hs.getAttribute("g") %>
<%=session.getAttribute("n") %>
<%=session.getAttribute("n") %>
</body>
</html>