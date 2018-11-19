<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Last Action Status : ${requestScope.status}</h3>
	<table style="background-color: cyan; margin: auto;" border="1">
		<c:forEach var="v" items="${requestScope.vendor_list}">
			<tr>
				<td>${v.name}</td>
				<td>${v.city}</td>
				<td>${v.phoneNo}</td>
				<td><a href="<spring:url value='/vendor/update?vid=${v.id}'/>">Update</a></td>
				<td><a href="<spring:url value='/vendor/delete?vid=${v.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<h4>
		<a href="<spring:url value='/vendor/add'/>">Add New Vendor</a>
	</h4>
	<h4>
		<a href="<spring:url value='/vendor/logout'/>">Log Out</a>
	</h4>
</body>
</html>