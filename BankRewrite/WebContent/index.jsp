<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.business.Person" %>
<% Person person = (Person) session.getAttribute("person"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Bank of Roy</title>
<link rel="stylesheet" type="text/css" href="./stlyes/styles.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" 
			integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" 
			crossorigin="anonymous">
</head>
<body>

<form class="container" action="RegistrationServlet" method="post">

<div class="form-group">
<label for="firstName">First Name</label>
<input type="text" class="form-group" name="firstName" id="firstName" placeholder="First Name">
</div>

<div class="form-group">
<label for="lastName">Last Name</label>
<input type="text" class="form-group" name="lastName" id = "lastName" placeholder="Last Name">
</div>

<div class="form-group">
<label for="password">Password</label>
<input type="text" class="form-group" name="password" placeholder="password">
</div>

<div class="form-group">
<label for="email">E-mail Address</label>
<input type="text" class="form-group" name="email" placeholder="Email">
</div>

<button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>