<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.business.Person" %>
<% Person person = (Person) session.getAttribute("person"); %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="navbar-header">
<button type="button class="navbar-toggle collasped" data-toggle="collapse" data-target="#navbar" aria-expended="false" aria-controls="navbar">
<span class="sr-only">Toggle navigation</span>
<span="icon-bar"></span>
<span="icon-bar"></span>
<span="icon-bar"></span>
</button>
<h4>Welcome To The Second Bank of Roy </h4>
</div>
<div id="navbar" class="navbar-collapse collaspe">
</div><!-- /.navbar-collaspe -->
</div>
<nav>
<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
<div class="continer">
<h4>Hello, <% out.print(person.getFirstName()+" "); 
 	out.print(person.getLastName()); %><br>
	<% out.print(person.getAddress());
 %>
</h4>

<p>What would you like to do?</p>
<a href="index.jsp"><br>Log out</a>
<a href="atm.jsp"><br>deposit or withdraw funds</a>
<a href="printer.jsp"><br>account history</a>
<a href="update.jsp"><br>update information</a>
</form>

</div>
<hr>
<footer>

</footer>
</div><!-- /container -->
</div>
</body>
</html>