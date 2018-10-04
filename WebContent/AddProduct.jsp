<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="registerStyle.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>

<body>
		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h1 class="title">Paradise Island SPA</h1>
	               		<hr />
	               	</div>
	            </div> 
				<div class="main-login main-center">
					
					<div class="form-group ">
						<form action = "Succes" method = "method in the servlet">
							<!-- Nu sterge acest form; fara el nu merg celelalte ; n-am inca o explicatie -->
						</form>
						
						<form action = "AddProduct" method = "POST">	
					

							<div class="form-group">
								<label for="nume" class="cols-sm-2 control-label">Nume Produs</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
										<input type="text" class="form-control" name="nume" id="nume"  placeholder="Enter your Product"/>
									</div>
								</div>
							</div>
							
							<div class="form-group">
								<label for="nume" class="cols-sm-2 control-label">Pret</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
										<input type="text" class="form-control" name="pret" id="pret"  placeholder="Price"/>
									</div>
								</div>
							</div>
							
							<div class="form-group">
								<label for="nume" class="cols-sm-2 control-label">Tip</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
										<input type="text" class="form-control" name="tip" id="tip"  placeholder="Tip"/>
									</div>
								</div>
							</div>
							
							
							

							<input type ="submit" value = "Register" class="btn btn-primary btn-lg btn-block login-button">
						</form>

					</div>
					<div class="login-register">
		
				    </div>
				</div>
			</div>
		</div>
</body>
</html>