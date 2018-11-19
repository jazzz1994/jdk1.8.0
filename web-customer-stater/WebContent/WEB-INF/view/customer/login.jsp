<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${requestscope.status}</h1>
	<form method="post" >
		<input type="email" name = "email" placeholder="Enter The Email" />
		<input type="password" name = "pass" placeholder="Enter the Password" />
		<input type="submit" formaction="validate" />
		
	</form>
</body>
</html>