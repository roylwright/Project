<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.business.Person" %>
<% Person person = (Person)session.getAttribute("person"); %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ATM</title>
</head>
<body>

---------------------checking-----------------------------
<form class="container" action="ATMServlet" method="post">
<div class="form-group">
<h4>Checking balance is: <% out.print(person.getChecking().getBalance()); %></h4>
<label for="deposit">deposit</label>
<input type="text" class="form-group" name="checkingdeposit" id="checkingdeposit" placeholder="checkingdeposit">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>

<form class="container" action="ATMServlet" method="post">
<div class="form-group">
<label for="lastName">withdraw</label>
<input type="text" class="form-group" name="checkingwithdraw" id = "checkingwithdraw" placeholder="checkingwithdraw">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>
-------------------------savings---------------------------
<form class="container" action="ATMServlet" method="post">
<div class="form-group">
<h4>Saving balance is: <% out.print(person.getSavings().getBalance()); %></h4>
<label for="deposit">deposit</label>
<input type="text" class="form-group" name="savingdeposit" id="savingdeposit" placeholder="savingdeposit">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>

<form class="container" action="ATMServlet" method="post">
<div class="form-group">
<label for="lastName">withdraw</label>
<input type="text" class="form-group" name="savingwithdraw" id = "savingwithdraw" placeholder="savingwithdraw">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>

<a href="account.jsp"><br>main menu</a>
</body>
</html>