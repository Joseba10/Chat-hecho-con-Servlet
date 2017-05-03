<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="usuario" scope="request"
 class="com.ipartek.ejemplos.joseba.tipos.Usuario" />
 	<%@ include file="includes/cabecera.jsp" %>
	<form action="alta" method="post">
	
		<fieldset>

			<label for="nombre">Nombre</label> 
			<input id="nombre" name="nombre" required minlength="4" value="${usuario.nombre} " >

		</fieldset>

		<fieldset>

			<label for="pass">Contraseña</label>
			<input id="pass" name="pass" type="password">

		</fieldset>
		<fieldset>

			<label for="pass2">Contraseña</label>
			<input id="pass2" name="pass2" type="password">

		</fieldset>
		<fieldset>

			<input type="submit" value="Alta">
			<p class="errores">${usuario.errores }</p>

		</fieldset>
	</form>
	
	<%@ include file="includes/pie.jsp" %>



