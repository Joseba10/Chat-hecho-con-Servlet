<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="usuario" scope="request"
 class="com.ipartek.ejemplos.joseba.tipos.Usuario" />
 	<%@ include file="includes/cabecera.jsp" %>
 	<style>
 	
ul{

margin-left: 500px;
margin-top: 30px;

}

li{
background-color: #EFEFEF;
width:100px;
border:solid #EFEFEF;
-webkit-border-radius: 19px;
-moz-border-radius: 19px;
border-radius: 19px;
color:blue;
text-align:center;
display: inline-block;

}

li a:hover {
	color:red;
}

li a{
text-decoration: none;
}

fieldset{

border: none;}

form{


margin-left: 530px;
margin-top: 50px;}

.errores{

margin-top:20px;
width: 200px;
}





</style>
 	<ul>
 		<li><a href="#">Login</a></li>
 		<li><a href="/pruebas/alta">Alta</a></li>
 	</ul>
	<form action="loginserver" method="post">
	
		<fieldset>

			<label for="nombre">Nombre</label> 
			<input id="nombre" name="nombre" required minlength="4" value="${usuario.nombre} " >

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
	
	<%@ include file="includes/pie.jsp" %>



