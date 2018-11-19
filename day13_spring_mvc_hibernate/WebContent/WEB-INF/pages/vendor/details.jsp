<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--importing spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${sessionScope.status}</h3>
	<h4>Details : ${sessionScope.user_dtls}</h4>
	<h5>
		<a href="<spring:url value='/vendor/logout'/>">Log Out</a>
	</h5>

</body>
</html>