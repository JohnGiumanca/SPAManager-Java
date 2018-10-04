<%@page import="com.ParadiseIslandSPA.Client"%>
<%@page import="com.ParadiseIslandSPA.Receptioner"%>
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
	
		<% 
		String acces = (String)request.getAttribute("acces");
		if(acces != null && acces.equals("permis")){
			String zona = request.getParameter("zona");
			if(zona != null)
				out.print("<h1>Sunteti in " + zona + "</h1>"); 
		}else{
			out.print("<h1>"+ "Acces interzis" + "</h1>"); 
		}
		%>
	
	<form action="Shop" method="POST">
		<div id="butoaneMeniu">
			<button type="submit" class="btn btn-primary" name="Zona">Zone</button>
			<button type="submit" class="btn btn-primary" name="Bar">Bar</button>
			<button type="submit" class="btn btn-primary" name="Restaurant">Restaurant</button>
			<button type="submit" class="btn btn-primary" name="Servicii">Servicii</button>
			</form>
			
			<form action="Chitanta" method="GET">
			<button type="submit" class="btn btn-primary" name="Chitanta">Chitanta</button>
			</form>
		</div>
	</form>
	
	<form action="Menu" method="POST">
		<div id="butoaneZone">
			<button type="submit" class="btn btn-success" name="zona" value ="Zona A">Zona A</button>
			<button type="submit" class="btn btn-success" name="zona" value ="Zona B">Zona B</button>
			<button type="submit" class="btn btn-success" name="zona" value ="Zona C">Zona C</button>
			<button type="submit" class="btn btn-success" name="zona" value ="Zona D">Zona D</button>
			<input name="email" value="<%out.print(request.getParameter("email"));%>" style="display: none"></input>
			<!-- cam urata chestia asta, dar a fost singura solutie la care ne-am gandit -->
		</div>
	</form>
	

</body>
</html>