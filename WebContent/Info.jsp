<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<style>
html{
	background-image: url("info_background.jpg");
	background-size: cover;
	 background-repeat: no-repeat;
}
table {
    border-collapse: collapse;
    width: 100%;
    margin-top:50px;
    color:white;
}

th, td {
    padding: 5px;
    text-align: left;
    padding-left:30%;
    border-bottom: 1px solid #ddd;
}
</style>

<% 
	String a = (String)request.getAttribute("statusZonaA");
	String b = (String)request.getAttribute("statusZonaB");
	String c = (String)request.getAttribute("statusZonaC");
	String d = (String)request.getAttribute("statusZonaD");
%>
<table>
  <tr>
    <th>Zona </th>
    <th>Numar clienti</th>
    
  </tr>
  <tr>
    <td>Zona A</td>
    <td><%out.println("<h1>"+ a +"</h1>");%></td>
    
  </tr>
  <tr>
    <td>Zona B</td>
    <td><%out.println("<h1>"+ b +"</h1>");%></td>
   
  </tr>
  <tr>
    <td>Zona C</td>
    <td><%out.println("<h1>"+ c +"</h1>");%></td>
   
  </tr>
  <tr>
    <td>Zona D</td>
    <td><%out.println("<h1>"+ d +"</h1>");%></td>
    
  </tr>
</table>

</body>
</html>