<%@ page contentType="text/html; charset=utf-8" 
isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h2>Login Success</h2>
${userLogInfo.username}님! 환영합니다.<br>
<a href="logout">로그아웃</a><br>
<a href="${pageContext.servletContext.contextPath}/page1">페이지1</a><br>
<a href="${pageContext.servletContext.contextPath}/admin/admin">관리자</a><br>
</body>
</html>








