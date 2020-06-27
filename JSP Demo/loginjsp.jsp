<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP</title>
</head>
<body>
<%
	String name=request.getParameter("uname");
	String pwd=request.getParameter("pwd");
	if(name.equals("Admin") && pwd.equals("wipro@123"))
		out.print("<h1><font color=green><b>Welcome Admin!!!</b></font></h1>");
	else
		out.print("<h1><font color=red><b>Sorry Invalid username or password!!!</b></font></h1>");
	
%>
</body>
</html>