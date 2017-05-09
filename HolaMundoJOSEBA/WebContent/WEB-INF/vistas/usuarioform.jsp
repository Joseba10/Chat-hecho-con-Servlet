<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="usuario" scope="request"
 class="com.ipartek.ejemplos.joseba.tipos.Usuario" />
 
 	<%@ include file="includes/cabecera.jsp" %>
 	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 	
 	
	<form action="usuarioform" method="post">
		
<style>
 	
ul{

margin-left: 0px;
margin-top: 0px;

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
 		<li><a href="/pruebas/loginserver">Login</a></li>
 		<li><a href="#">Alta</a></li>
 	</ul>
		<fieldset>

			<label for="nombre">Nombre</label> 
			<input id="nombre" name="nombre"
			 required minlength="4" value="${usuario.nombre}"
			 
			<c:if test="${param.op=='modificar' or param.op == 'borrar'}">
			
			 
readonly="readonly"
			  </c:if>
>
		</fieldset>

		<fieldset>

			<label for="pass">Contraseña</label>
			<input id="pass" name="pass" type="password">

		</fieldset>
		<fieldset>

			<label for="pass2">Contraseña Otra vez</label>
			<input id="pass2" name="pass2" type="password">

		</fieldset>
		<fieldset>

			<input type="submit" value="${fn:toUpperCase(param.op) }">
			<p class="errores">${usuario.errores }</p>
			
			<input type="hidden" name="opform" value="${param.op }">

		</fieldset>
	</form>
	
	<c:if test="${param.op == 'borrar'}">
		<script>
			document.forms[0].onsubmit = confirmarBorrado;
		</script>
	</c:if>
	<%@ include file="includes/pie.jsp" %>



