<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="" modelAttribute="emp">
<pre>
EID  :<form:input path="eid"/>
ENAME  :<form:input path="ename"/>
ESAL  :<form:input path="esal"/>
      <from:button>Submit</from:button>
</pre>
</form:form>
</body>
</html>