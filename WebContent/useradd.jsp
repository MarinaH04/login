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


 try {	
	 String user = request.getParameter("user");
	 String email = request.getParameter("email");
	 String pass = request.getParameter("pass");
	 	Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "Lhtlil@004");
		System.out.println("Database was Connected");
		PreparedStatement ps = connection.prepareStatement("INSERT INTO `student` (`username`, `email`, `password`) VALUES ('"+user+"','"+email+"','"+pass+"');");
		ps.executeUpdate();
		System.out.print("Data inserted");
 }
 catch (Exception e){
	 System.out.print(e);
	
 }
%>
</body>
</html>