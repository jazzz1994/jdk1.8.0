<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>In update Form</h1>
<form:form method="post" style="margin:auto" modelAttribute="customer">
	<form:input type="hidden"  name="id" path="id" /><br>
	<form:input type="text"  name="firstName" path="firstName" placeholder="Enter the First Name" /><br>
	<form:input type="text"  name="lastName" path="lastName" placeholder="Enter the Last Name"  /><br>
	<form:input type="email" name="email"    path="email" placeholder="Enter the email" /><br>
	<input type="submit" value="updatecustomer">
</form:form>
</body>
</html>