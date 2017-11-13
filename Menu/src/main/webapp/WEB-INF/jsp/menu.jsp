<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		<button type="button" class="navbar-toggle collasped" data-toggle="collapse" 
					data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
	<a class="nav navbar-brand" href="/home">Diet Destriction (home)</a>
	</div>
	<div id="navbar" class="collaspe navbar-collapse">
	<ul class="nav navbar-nav navbar-right">
	<li class="active"><a href="/">add 
	recipe</a></li>
	<li class="active"><a href="/home">menu page</a></li>
	<li class="active"><a href="/menu">menu plans</a></li>
	<li><a class="glyphicon glyphicon-log-in" href="#">Log out</a></li>
	<li><a class="glyphicon glyphicon-user" href="#">Settings</a></li>
	</ul>
	</div>
<!-- nav collapse --></div></nav>

<div class="container home-container">
	<div class="container text-container">
		<div class="row">
			<div class="col-sm-3">		
					
			</div>
			
				<div class="col-sm-12">
					
					<div class="well4">
						<h2> </h2>
						<h2>2000 calorie diet FDA guidelines diet goals:</h2>
						<h2>Daily: 2000 Calories, 150g Protein, 200g Carbs, 75g Fat </h2>
						<h2>One Meal: 665 Calories,  50g Protein,  90g Carbs,  25g Fat</h2>
						<h2>minimum Protein = weight/2.5 adjust Protein as needed</h2>
					</div>
					
					<div class="well4">
						<h2>1800 calorie low-fat diet goals:</h2>
						<h2>Daily: 1800 Calories, 150g Protein, 200g Carbs, 25g Fat </h2>
						<h2>One Meal: 600 Calories,  50g Protein,  90g Carbs,  8g Fat</h2>
						<h2>minimum Protein = weight/2.5 adjust Protein as needed</h2>
					</div>
					<div class="well4">
						<h2>1800 calorie low-carb diet goals:</h2>
						<h2>Daily: 1800 Calories, 200g Protein, 100g Carbs, 150g Fat </h2>
						<h2>One Meal: 600 Calories,  65g Protein,  35g Carbs,  50g Fat</h2>
						<h2>minimum Protein = weight/2.5 adjust Protein as needed</h2>
						<h1>Warning! Do not increase protein with animal meats, this can damage your liver. </h1>
					</div>
					<div class="well4">
						<h2>1800 calorie high-protein diet diet goals:</h2>
						<h2>Daily: 1800 Calories, 250g Protein, 100g Carbs, 100g Fat </h2>
						<h2>One Meal: 600 Calories,  85g Protein,  35g Carbs,  35g Fat</h2>
						<h2>minimum Protein = weight/2.5 adjust Protein as needed</h2>
						<h1>Warning! Do not increase protein with animal meats, this can damage your liver. </h1>
					</div>
				</div>
			</div>
		 
		
	</div>
</div>			
<!-- /.container -->
</body>
</html>