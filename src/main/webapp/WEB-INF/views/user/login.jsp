<%@ page contentType="text/html; charset=utf-8" 
isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h2>Login</h2>
<form id="loginfrm" name="loginfrm" action="loginProcess" method="POST">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	id : <input type="text" name="id"/><br><br>
	password : <input type="text" name="pw"/><br><br>
	<input type="submit" value="login"/>
</form>
</body>
</html>








