<%@page import="org.apache.el.lang.ELSupport"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<% 
String result=(String)request.getAttribute("result");
String name=request.getParameter("uname");
if(result.equals("Success"))
	{
%>
<h1 style="color:green"><b><i>Welcome <%= name %></i></b></h1>

<%
	}
else {
%>
<h1 style="color:red"><b><i>Sorry <%= name %>, you are not valid user</i></b></h1>
<% } %>
</body>
</html>