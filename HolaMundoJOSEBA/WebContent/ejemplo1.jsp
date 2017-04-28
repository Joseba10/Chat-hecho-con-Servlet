<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

h1{

background-color:lightgray}


</style>


<script>

/*function refresco(){
	
	
location.reload();
}

setTimeout(refresco, 1000);
*/
</script>
</head>
<body>

	
		<h1><%= new Date() %></h1>


		<% for(int i=1; i<=6;i++){ %>
			<h<%=i %>>Prueba</h<%=i %>>
		<%} %>
		
	

</body>
</html>