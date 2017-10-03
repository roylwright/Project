<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.business.Person"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	Person person = (Person) session.getAttribute("person");
%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Checking</h3>
	<table class="table">
		<tr>
			<th>Transaction type</th>
			<th>amount</th>
		</tr>
		<c:forEach var="trans" items="${person.checking.transaction}">
			<tr>
				<td><c:out value="${trans.type}" /></td>
				<td><c:out value="${trans.amount}" /></td>
			</tr>
		</c:forEach>

	</table>
	
	<h3>Savings</h3>
	<table class="table">
		<tr>
			<th>Transaction type</th>
			<th>amount</th>
		</tr>
		<c:forEach var="trans" items="${person.savings.transaction}">
			<tr>
				<td><c:out value="${trans.type}" /></td>
				<td><c:out value="${trans.amount}" /></td>
			</tr>
		</c:forEach>

	</table>
	<a href="account.jsp"><br>main menu</a>
</body>
</html>