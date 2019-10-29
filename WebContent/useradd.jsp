<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World!
<%

 String databaseName="student_database";
 String url="jdbc:mysql://localhost:3306/" +databaseName;
 String username="root";
 String password="Lhtlil@004";
 try {
	 	Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "Lhtlil@004");
		System.out.println("Database was Connected");
 }
 catch (Exception e){
	 System.out.print(e);
	
 }
%>
</body>
</html>