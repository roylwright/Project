<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.business.Person" %>
<% Person person = (Person)session.getAttribute("person"); %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form class="container" action="RegistrationServlet" method="post">

<div class="form-group">
<label for="password">Password</label>
<input type="text" class="form-group" name="password" placeholder="password">
</div>
<h4>Hello, <% out.print(person.getFirstName()+" "); %></h4>
<br>Address<br>
<div class="form-group">
<label for="street">Street</label>
<input type="text" class="form-group" name="street" id="street" placeholder="Street">
</div>
<div class="form-group">
<label for="city">City</label>
<input type="text" class="form-group" name="city" id="city" placeholder="City">
</div>
<div class="form-group">
<label for="state">State</label>
<input type="text" class="form-group" name="state" id=""state placeholder="State">
</div>
<div class="form-group">
<label for="zipCode">Zip Code</label>
<input type="text" class="form-group" name="zipCode" id="zipCode" placeholder="Zip Code">

<input type="hidden" name="pageType" value="account">
</div>

<div class="checkbox">
<label>
<input type="checkbox">Check me out
</label>
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>

<a href="account.jsp"><br>main menu</a>
</body>
</html>