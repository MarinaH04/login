<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.PrintWriter"%>
    <%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<%		
	
	try {	
		String user = request.getParameter("username");  
		String pass = request.getParameter("password");
	 	Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "Lhtlil@004");
		System.out.println("Database was Connected");
		Statement students = connection.createStatement();
		ResultSet rs = students.executeQuery("SELECT username FROM student where username='"+user+"';");
		
		String users = "";
		String users1 = "";
		while(rs.next()){
			users = rs.getString("username");
			System.out.print(users + "\n");
		}
		
		if(users.equals("")){
			System.out.println("Username inexistent");
		}
		else{
		Statement students1 = connection.createStatement();
		ResultSet rs1 = students1.executeQuery("SELECT password FROM student where username='"+users+"'");
		
		while(rs1.next()){
			users1 = rs1.getString("password");
			
		}
		if(users1.equals(pass)){
			System.out.print(users1);
		}
		else {
			System.out.println("Parola gresita");
		}}
		
		
 }
 catch (Exception e){
	 System.out.print(e);
	
 }%>
		<div class="text3">Bine ai venit:  <% %></div>
<script src="formular.js"></script>
</body>
</html>