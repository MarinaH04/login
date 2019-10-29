<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<%	
		String email = request.getParameter("email");  
		String pass = request.getParameter("password");
		
		if(email.equals("hanzumarina@yahoo.com") && pass.equals("1234")){
			session.setAttribute("email", email);
			response.sendRedirect("logged.jsp");
			}
		else 
		{
			response.sendRedirect("formular.jsp");
			
		}
		
	%>	
		<div class="text3">Bine ai venit: <%= email %> </div>
<script src="formular.js"></script>
</body>
</html>