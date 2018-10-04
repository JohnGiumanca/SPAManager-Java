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
   String tipProdus = (String) request.getAttribute("tipProdus");
%>
<div class="page">
	<div id="store_cart">
		<ul class="cart_head">
		
		 	<li class="cart_head_product">
				Produs
			</li>
			<li class="cart_head_options">
				Cantitate
			</li>
			<li class="cart_head_price">
				Pret
			</li> 
		</ul>

<c:forEach var="product" items="${denumireProduse}">
<form action="Shop" method="POST">
		<ul class="cart_item">

			<li class="cart_product_col" >
				<textarea name="denumire" style="display:none;" >${product.getNumeProdus()}</textarea>
				<h2 name="denumire"  >${product.getNumeProdus()}</h2>
			</li>
			 
      		<li class="cart_options_col" >
				<span>Quantity: </span>
        <input type="number" min="1" value="1" name="cantitate">
			</li>

			<li class="cart_price_col" >
			<textarea name="pret" style="display:none;">${product.getPretProdus()}</textarea>
			<textarea name="idProdus" style="display:none;">${product.getIdProdus()}</textarea>
			<textarea name="email" style="display:none;">${email}</textarea>
			<textarea name="tipProdus" style="display:none;">${tipProdus}</textarea>
			<h2>${product.getPretProdus()}</h2>
			</li>


			<li class="accept">
        <!--  <img src="https://cdn.onlinewebfonts.com/svg/img_334581.png"> -->
   
        <button type="submit" class="btn btn-primary" name="addToCart">Cumpara</button> 
   </form>
			</li>
		</ul>
</c:forEach>
	<!-- <ul class="cart_item">


			<li class="cart_product_col">
				<p>SX Max Pro Lite</p>
				<span><strong>Size: </strong>Medium</span>
			</li>
			 
      		<li class="cart_options_col">
				<span>Quantity: </span>
				<input type="number" min="1" value="1">
			</li>

			<li class="cart_price_col">
				<h2>$399</h2>
			</li>
			<li class="accept">
        <img src="https://cdn.onlinewebfonts.com/svg/img_334581.png">
			</li>
		</ul> -->

<form action="Shop" method="POST">
<button type="submit" class="btn btn-primary" name="finalizareComanda">Finalizare Comanda</button>
</form>
	</div>
</div>
</body>
</html>