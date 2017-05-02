<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
<jsp:useBean id="usuario" scope="request"
 class="com.ipartek.ejemplos.joseba.tipos.Usuario" />
 
	<form action="loginserver" method="get">
	
		<fieldset>

			<label for="nombre">Nombre</label> 
			<input id="nombre" name="nombre" value="${usuario.nombre}" }>

		</fieldset>

		<fieldset>

			<label for="pass">Contraseña</label>
			<input id="pass" name="pass" type="password">

		</fieldset>
		<fieldset>

			<input type="submit" value="Login">
			<p class="errores">${usuario.errores }</p>

		</fieldset>
	</form>




</body>
</html>