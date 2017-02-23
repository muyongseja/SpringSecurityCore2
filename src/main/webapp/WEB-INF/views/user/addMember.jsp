<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h2>회원 가입</h2>
<form method="post" action="addMember">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	아이디 : <input type="text" name="userid" /><br><br>
	패스워드 : <input type="password" name="userpw" /><br><br>
	이름 : <input type="text" name="username" /><br><br>
	이메일 : <input type="text" name="email" /><br><br>
	<input type="submit" value="가입">
</form>
</body>
</html>















