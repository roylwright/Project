<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
		"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Diet Destricter (login)</title>
	<link rel="stylesheet" 
			href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collasped" data-toggle="collapse" 
						data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
			<a class="nav navbar-brand" href="/">Diet Destricter</a>
		</div>
		<div id="navbar" class="collaspe navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
			<li class="active"><a href="/">Home</a></li>
			<li><a class="glyphicon glyphicon-log-in" href="/login">Login</a></li>
			<li><a class="glyphicon glyphicon-user" href="/signup">Signup</a></li>
			</ul>
			</div>
			<!-- nav collaspe -->
		</div>
		</nav>
		<div class="container">
		<form:form class="form-signin" modelAttribute="userLogin" method="post" action="/login">
		<h2 class="form-signin-heading">Please sign in</h2>
		<label class="sr-only">Email address</label>
		<form:input type="text" class="form-control" placeholder="Email address" 
				path="email" required="true"></form:input>
		<label class="sr-only">Password</label>
		<form:input type="password" class="form-control" placeholder="Password" 
				path="password" required="true"></form:input>
		<div class="checkbox">
		<label><input type="checkbox" value="remember-me">Remember me</label>
		</div>
		<button class="bttn btn-lg btn-primary btn-block" type="submit">sign in</button>
		</form:form>
	</div>
	<!-- /.container -->
</body>
</html>