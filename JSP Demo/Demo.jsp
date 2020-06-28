<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo JSP</title>
</head>
<body>

<%out.print("Welcome to JSP"); %></br></br><!-- Scriplet tag is used to execute java source code in jsp-->
<%! String name="Admin"; %>
<% out.print("Hello "+name); %></br></br><!-- Declaration tag JSP is used to declare fields and methods. -->
<!-- The jsp scriptlet tag can only declare variables not methods.	The jsp declaration tag can declare variables as well as methods. -->
How are you ? <%=name %>

</body>
</html>
