<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
	
	<style type="text/css">
	
	h1,p{
	text-align: center;
}
	
	
	</style>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="css/estilos.css">
	<title>Ejemplo MVC</title>

</head>

<body>

	<header>
		
		<h1>Ejemplo MVC</h1>
		<p>Ejemplos de uso de MVC con diferentes tecnicas</p>
	</header>
	
	<nav>
		<ul>
			<li><a href="login">Login</a></li>
			<li><a href="usuarioform?op=alta">Alta</a></li>
			<li><a href="login?opcion=logout">Salir</a></li>
			<li><a href="usuariocrud">Mantenimiento usuarios</a></li>
		</ul>
	</nav>
