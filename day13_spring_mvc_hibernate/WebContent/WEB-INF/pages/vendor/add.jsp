<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">${sessionScope.shop.status}</h3>
	<form:form method="post" modelAttribute="vendor">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter Vendor Email</td>
				<td><form:input  path="email" /></td>
			</tr>
			<tr>
				<td>Enter Vendor Password</td>
				<td><form:password path="pass" /></td>
			</tr>
			<tr>
				<td>Enter Vendor Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>Enter Phone No</td>
				<td><form:input path="phoneNo" /></td>
			</tr>
			
			<tr>
				<td>Enter Vendor Role</td>
				<td><form:input path="role" /></td>
			</tr>
			

			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>