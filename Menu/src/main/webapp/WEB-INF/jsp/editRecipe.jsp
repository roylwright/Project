<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
		"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diet Destriction (home)</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collasped"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="nav navbar-brand" href="/">Diet Destriction (home)</a>
		</div>
		<div id="navbar" class="collaspe navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="/addrecipe">add recipe</a></li>
				<li class="active"><a href="/menu">menu plans</a></li>
				<li><a class="glyphicon glyphicon-log-in" href="#">Log out</a></li>
				<li><a class="glyphicon glyphicon-user" href="#">Settings</a></li>
			</ul>
		</div>
		<!-- nav collapse -->
	</div>
	</nav>
	<div class="container home-container">
		<div class="container text-container">
			<div class="row">
				<br>
				<br>
				<br>
				<!-- **********start of display loop************************************* -->

				<div class="col-sm-9">
					<div class="well">
						<form:form action="/saveRecipe" method="POST"
							modelAttribute="recipe">
						recipeName: <form:input path="recipeName" />
						
						Ingredients: 
							<select name="newI" id="newI">
								<c:forEach items="${ingredients}" var="newI">
									<option value="${newI.ingredientName}">${newI.ingredientName}</option>
								</c:forEach>
							</select>




							<br>
							<button class="dropbtn">Choose Ingredient</button>


						</form:form>


					</div>
				</div>
			</div>
			<!-- /.container -->
</body>
</html>