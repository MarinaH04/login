<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css.map" rel="stylesheet" type="text/css">
<link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-grid.css.map" rel="stylesheet" type="text/css">
<link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-reboot.css.map" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
<link rel="stylesheet" href="style.css">

</head>
<body>
	<div class="container-fluid mt-5 bg">

		<div class="row mt-5">
			<div class="hidden-sm col-md-1"></div>
			<div class="col-xl-3 col-lg-5 col-md-5 col-sm-12">

				<form class="text-center p-5 formular form1" action="addLogin.jsp" method="post">

					<p class="h4 mb-4">Sign in</p>


					<input type="email" id="defaultLoginFormEmail"
						class="form-control mb-4" name = "email" placeholder="E-mail"> 
					<input type="password" id="defaultLoginFormPassword"
						class="form-control mb-4" name = "password" placeholder="Password">

					<div class="d-flex justify-content-around">
						<div>

							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input"
									id="defaultLoginFormRemember"> <label
									class="custom-control-label" for="defaultLoginFormRemember"><p>Remember
										me</p></label>
							</div>
						</div>

						<div>

							<a href="">Forgot password?</a>
						</div>
					</div>

					<button class="btn btn-info btn-block my-4 culoarebuton" id="butonul"
						type="submit">Sign in</button>
						

					<p>Not a member?
					<p id="register">Register</p>
					</p>

					<p>or sign in with:</p>

					<a href="#" class="mx-2" role="button"><i
						class="fab fa-facebook-f light-blue-text"></i></a> <a href="#"
						class="mx-2" role="button"><i
						class="fab fa-twitter light-blue-text"></i></a> <a href="#"
						class="mx-2" role="button"><i
						class="fab fa-linkedin-in light-blue-text"></i></a> <a href="#"
						class="mx-2" role="button"><i
						class="fab fa-github light-blue-text"></i></a>

				</form>

				<form class="text-center p-5 formular form2" action="add" method="post">

					<p class="h4 mb-4">Register</p>

					<input type="text" id="defaultLoginFormInput" 
						class="form-control mb-4" placeholder="Username" name="user">
					<input type="email" id="defaultLoginFormEmail"
						class="form-control mb-4" placeholder="E-mail" name="email"> 
					<input type="password" id="defaultLoginFormPassword"
						class="form-control mb-4" placeholder="Password" name="pass">

					

					<button class="btn btn-info btn-block my-4 culoarebuton"
						type="submit">Sign up</button>

					<p>
						Have already an account?<br>
					<p id="login">Login</p>
					</p>

				</form>

			</div>

			
			
			
			<div class="hidden-sm col-md-1"></div>
			
			<div class="col-lg-5 col-md-5 col-sm-12 text1 mt-5">
				<div class="text2">
					<h1>AUSY TECHNOLOGIES ROMANIA</h1>
					<p>The AUSY Group is founded on the excellence of its
						consultants and employees. Its development is driven by its
						ability to react quickly, to offer clients innovative solutions
						and to detect new growth opportunities. Our values are represented
						by the concept IMPROVE</p>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.js"></script>
	<script type="text/javascript" src="js/bootstrap.bundle.js.map"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="formular.js"></script>
	
</body>
</html>