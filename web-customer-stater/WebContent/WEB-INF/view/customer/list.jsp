<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id = "wrapper">
		<div id="header">
			<h2> CRM -Customer Relationship Manager</h2>
			<h1>${requestScope.status}</h1>
		</div>
	</div>
	
	
	<div id = "container">
		<div id="content">
			
			<table border="1px solid black">
				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>action</th>
				</tr>
						
		<c:forEach var="cust" items="${requestScope.customers}">
			  <tr>
				<td>${cust.firstName}</td>
				<td>${cust.lastName}</td>
				<td>${cust.email}</td>	
				<td><a href ='<spring:url value="/customer/delete?cid=${cust.id}" />'>delete</a>||<a href ='<spring:url value="/customer/update?cid=${cust.id}" />'>update</a></td>
			  </tr>
		</c:forEach>
		
			<tr>
				<td colspan=3><a href='<spring:url value="/customer/add" />'>Add New Customer</a></td>
			</tr> 
		
			</table>
		</div>
	</div>
	
	
</body>
</html>