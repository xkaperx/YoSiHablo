<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yo si hablo</title>
</head>
<body>

	<h1>Lista de idiomas</h1>
	<ol>
		<c:forEach items= "${ idiomas }" var="idioma">
			<li> ${ idioma}</li>
		</c:forEach>
	</ol>

	Tabla de idiomas
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Duracion</th>
				<th>Detalle</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items= "${ idiomas }" var="idioma">
			<tr>
			<td>${idioma.id }</td>
			<td>${idioma.titulo }</td>
			<td>${idioma.duracion } meses</td>
			<td>${idioma.detalle }</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>

</body>
</html>