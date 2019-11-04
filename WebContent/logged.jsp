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
<link rel="stylesheet" href="style2.css">

<title>Logged in</title>

</head>
<body>
<% String user = (String)session.getAttribute("username");  %>
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
		<div class="col-md-4 editing"><p>Edit account</p></div>
		<div class="col-md-4 editing"><p>Delete account</p></div>
		<div class="col-md-4 editing"><p>Other</p></div>

	
	</div>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4 mt-5">
			<form action="#" class="formular_edit">
			<p>Edit your account</p>
			<hr>
				<span><img src="images/user.png"></span><input type="text" class="formtext">
				<span><img src="images/envelope.png"></span><input type="email" class="formtext">
				<span><img src="images/key.png"></span><input type="password" class="formtext">
				<input type="submit">
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>
</div>
	
	
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.js.map"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</body>
</html>