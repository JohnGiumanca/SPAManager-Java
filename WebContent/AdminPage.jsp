<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="menuStyle.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<title>Menu</title>
</head>
<body>
		<div id="butoaneMeniu">
			<form action="Info"  method="GET" >
				<button  type="submit" class="btn btn-success">Informatii</button>
			</form>
			
			<form action="AddProduct" method="GET"> 
				<button type="submit" class="btn btn-success">Adaugare Produs</button>
			</form>
			
			<form action="Register">
				<button type="submit" class="btn btn-success">Adaugare Client</button>		
			</form>
		</div>
	
</body>
</html>