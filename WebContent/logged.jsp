<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Logged in</title>
<style>
p {
color: white;
font-size: 24px;
background-color: rgba(1, 0, 0, 0.3);
margin-top: 10%;
padding: 25px;
}
</style>
</head>
<body>
	<% String em = (String)session.getAttribute("email"); %>
	<p>Bine ai venit, <%=em %></p>
</body>
</html>