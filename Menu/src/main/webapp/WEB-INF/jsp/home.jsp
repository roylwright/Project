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
	<a class="nav navbar-brand" href="/">Diet Destriction (home)</a>
	</div>
	<div id="navbar" class="collaspe navbar-collapse">
	<ul class="nav navbar-nav navbar-right">
	<li class="active"><a href="/">Home</a></li>
	<li><a class="glyphicon glyphicon-log-in" href="#">Log out</a></li>
	<li><a class="glyphicon glyphicon-user" href="#">Settings</a></li>
	</ul>
	</div>
<!-- nav collapse --></div></nav>
<div class="container home-container">
	<div class="container text-container">
		<div class="row">
		<br><br><br>		
		<c:forEach var="rec" items="${recipies}">
		<div class="row">
			<div class="col-sm-3">		
				<div class="well2">
					<br>
					<!-- picture is here from css page-->
				</div>	
			</div>
			<div class="col-sm-9">
				<div class="well">
				<p><c:out value="${rec.recipeName}"></c:out></p>
					<c:forEach var="etcetera" items="${etceteraList}"> 
						<c:if test = "${etcetera.recipeName==rec.recipeName}">
						<c:if test = "${etcetera.ingredientName !='Total'}">
						<c:out value="${etcetera}"></c:out>
						</c:if>
						<c:if test = "${etcetera.ingredientName =='Total'}">
						<c:out value="${etcetera} ${etcetera.ingredientCalories} Calories ${etcetera.ingredientProtein}g Protein ${etcetera.ingredientCarbs}g Carbs ${etcetera.ingredientFat}g Fat"></c:out>
						</c:if>
						
						</c:if>
					</c:forEach>
				<p><c:out value="${rec.text}"></c:out><p>
				</div>
				
				<button type="button" class="btn btn-default btn-sm">
				<span class="glphicon glyphicon-thumbs-up"></span>like</button>
				</div>
			</div>
			</c:forEach>
		</div>
	</div>
</div>			
<!-- /.container -->
</body>
</html>