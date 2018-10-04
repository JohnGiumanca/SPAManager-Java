<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping</title>
<!--  <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"> -->
<link rel="stylesheet" type="text/css" href="shopStyle.css">
<!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script> -->
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% String email = (String) request.getAttribute("email");
String suma =  (String) request.getAttribute("bilant");
System.out.println(suma);
%>
<div class="page">
	<div id="store_cart">
		<ul class="cart_head">
		
		 	<li class="cart_head_product">
				Produs cumparat
			</li>
			<li class="cart_head_options">
				Cantitate cumparata
			</li>
			<li class="cart_head_price">
				Pret pe unitate
			</li> 
			<li class="cart_head_price">
				Pret total produs
			</li> 
			
		</ul>

<c:forEach var="product" items="${denumireProduse}">
<form action="Chitanta" method="POST">
		<ul class="cart_item">

			<li class="cart_product_col" >
				<textarea name="denumire" style="display:none;">${product.getNumeProdus()}</textarea>
				<h2>${product.getNumeProdus()}</h2>
			</li>
			 
      		<li class="cart_options_col" >
				<span>Cantitate: </span></span><span>${product.getCantitateProdus()} </span>
			</li>

			<li class="cart_price_col">
			<h2>${product.getPretProdus()}</h2>
			</li>
			<li class="cart_price_col" >
			<textarea name="pret" style="display:none;">${product.getPretTotalProdus()}</textarea>
			<textarea name="idProdus" style="display:none;">${product.getIdProdus()}</textarea>
			<textarea name="email" style="display:none;">${email}</textarea>
			<textarea name="tipProdus" " style="display:none;">${tipProdus}</textarea>
			<h2>${product.getPretTotalProdus()}</h2>
			</li>
   </form>
			</li>
		</ul>
</c:forEach>

<span style= "color:red; font-weight:bold; background-color:black">Total : ${suma}</span>
<form action="Chitanta" method="POST">
<button type="submit" class="btn btn-primary" name="finalizareComanda">Achita Factura</button>
</form>
	</div>
</div>
</body>
</html>