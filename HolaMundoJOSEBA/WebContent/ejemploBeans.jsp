<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejemplo de JavaBeans</title>
</head>
<body>

<jsp:useBean id="usuario" scope="page" class="com.ipartek.ejemplos.joseba.tipos.Usuario"></jsp:useBean>

<h3>El Usuario es <jsp:getProperty property="nombre" name="usuario"/> y la password es 
<jsp:getProperty property="pass" name="usuario"/></h3> 

<!--La mejor forma - -->

<h1>El Usuario es ${usuario.nombre } y la password es ${usuario.pass }</h1>
</body>
</html>