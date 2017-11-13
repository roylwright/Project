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
	<li class="active"><a href="/addrecipe">add 
	recipe</a></li>
	<li class="active"><a href="/menu">menu plans</a></li>
	<li><a class="glyphicon glyphicon-log-in" href="#">Log out</a></li>
	<li><a class="glyphicon glyphicon-user" href="#">Settings</a></li>
	</ul>
	</div>
<!-- nav collapse --></div></nav>
<div class="container home-container">
	<div class="container text-container">
		<div class="row">
		<br><br><br><!-- **********start of display loop************************************* -->	
		<c:forEach var="rec" items="${recipies}">
		<div class="row">
			<div class="col-sm-2">		
				<div class="well2">
					<br>
					<!-- picture is here from css page-->
				</div>	
			</div>
				<div class="col-sm-10">
					<div class="well">
					<h1><c:out value="${rec.recipeName}"></c:out></h1><br>
					Calories:<c:out value="${rec.totalCalories}"></c:out>
					<c:out value="${rec.totalFat}"></c:out>g Fat
					<c:out value="${rec.totalCarbs}"></c:out>g Carbs
					<c:out value="${rec.totalProtein}"></c:out>g Protein<br>
						<c:forEach var="etcetera" items="${rec.etceteras}"> 
										<c:choose>
											<c:when test="${etcetera.ingredientName ne 'Total'}">
												<c:out value="${etcetera.ingredientName} ${etcetera.ingredientVolume} oz"></c:out>
												<br>
											</c:when>
											<c:otherwise>
											
												<c:out value="${etcetera.ingredientName}"></c:out>
												<c:out value="${etcetera.ingredientCalories}"> </c:out>Cal,
												<c:out value="${etcetera.ingredientProtein}"></c:out>g Protein, 
												<c:out value="${etcetera.ingredientCarbs}"></c:out>g Carbs,
												<c:out value="${etcetera.ingredientFat}"></c:out>  g Fat
											</c:otherwise>
										</c:choose>
						</c:forEach><!-- End for each loop inner display -->
						
						<%-- <c:out value="Total  ${person.calories} Cal, ${person.protein}g Protein, ${person.carbs}g Carbs, ${person.fat}g Fat"></c:out>
						<h2>Goal 665.0 Cal,  50.0g Protein,  90.0g Carbs,  25.0g Fat</h2>
 --%>					<p><c:out value="${rec.text}"></c:out><p>
 
 						<p><a href="editRecipe?rname=${rec.recipeName}">Edit Recipe</a><p>
					</div>
				</div>
			</div>
			</c:forEach><!-- end of for-each loop do not remove!!!!!!!!!!!!!****************** -->
		
		
	<!-- 	
		<div class="row">
			<div class="col-sm-3">		
				<div class="well2">
					<br>
					picture is here from css page
				</div>	
			</div>
				<div class="col-sm-9">
					<div class="well">
					<h2>Ultimate cheeseburger combo</h2>
					<h2>ultime cheeseburger</h2>
					<h2>medium fries</h2>
					<h2>medium soda</h2>
					<h2>Total:  1360.0 Cal,  50.0g Protein,  131.0g Carbs,  70.0g Fat</h2>
					<h2>Your goal: 665 Cal,    50g Protein,     90g Carbs,    25g Fat</h2>
					</div>
				</div>
			</div>
		
		<div class="row">
			<div class="col-sm-3">		
				<div class="well2">
					<br>
					picture is here from css page
				</div>	
			</div>
				<div class="col-sm-9">
					<div class="well">
					<h2>Baconater combo</h2>
					<h2>baconator sandwich</h2>
					<h2>medium fries</h2>
					<h2>medium soda</h2>
					<h2>Total:  1640.0 Cal,  75.0g Protein,  121.0g Carbs,  85.0g Fat</h2>
					<h2>Your goal: 665 Cal,    50g Protein,     90g Carbs,    25g Fat</h2>
					</div>
				</div>
			</div>
		 -->
		</div>
	</div>
</div>			
<!-- /.container -->
</body>
</html>