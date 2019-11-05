<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css.map" rel="stylesheet" type="text/css">
<link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-grid.css.map" rel="stylesheet" type="text/css">
<link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-reboot.css.map" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<link rel="stylesheet" type="text/css" href="style2.css">

<title>Logged in</title>

</head>
<body>
<% String user = (String)session.getAttribute("username"); 

String pass = (String)session.getAttribute("password");
String email = (String)session.getAttribute("email");
%>
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color: rgb(123, 89, 124)">
  <a class="navbar-brand" href="#">Student ULBS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Acasa <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Despre</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contact</a>
      </li>
    </ul>
    <span class="navbar-text">
    Welcome <%= user %>
    </span>
  </div>
</nav>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-4 editing"><p id="editare">Edit account</p></div>
		<div class="col-md-4 editing"><p id="delete">Delete account</p></div>
		<div class="col-md-4 editing"><p id="logout">Log out</p></div>

	
	</div>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4 mt-5" id="afisare">
			<form action="#" class="formular_edit">
			<p>Edit your account</p>
			<hr>
				<span><img src="images/user.png"></span><input type="text" class="formtext" value=<%=user %>>
				<span><img src="images/envelope.png"></span><input type="email" class="formtext" value=<%=email %>>
				<span><img src="images/key.png"></span><input type="password" class="formtext" value=<%=pass %>>
				<input type="submit">
			</form>
			
			<form action="logout" class="formular_logout" method="post">
				<input type="submit" value="Log out">
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>
</div>
	
	
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.js.map"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="formular1.js"></script>

</body>
</html>