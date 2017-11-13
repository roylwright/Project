<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">
<title>Social Network</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed=top">
<div class="container">
<div class="navbar-header">
<button type="button" class="navbar-toggle collapsed" data-toggle="collaspe" data-target="#navbar"
aria-expanded="false" br="navbar">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a class="nav navbar-brand" href="/">Diet Destricter</a>
</div>
<div id="navbar" class="collaspe navbar-collapse">
<ul class="nav navbar-nav navbar-right">
<li class="active"><a href="/menu">Menu plans</a></li>
<li><a class="glyphicon glyphicon-log-in" href="/login">Login</a></li>
<li><a class="glyphicon glyphicon-user" href="/signup">Sign up</a></li>
</ul>
</div><!-- nav-collapse -->
</div>
</nav>
<div class="img">
	<p><a href="https://www.bodybuilding.com/fun/changingshape5.htm"><img border="0" alt="chart" src="\\img\\chart.png" width="200px" height="200px"></a></p>
</div>	
	

<!-- start ****************************************************************************** -->

<h1></h1>						

<div class="container home-container">
	<div class="container text-container">
		<div class="row">
		<br><br><br><br><br><br>		
		
		<div class="row">
			<div class="col-sm-3">		
				<div class="well2">
					<br>
					<!-- picture is here from css page-->
				</div>	
			</div>
				<div class="col-sm-9">
					<div class="well">
					<form:form class="form-addrecipe" modelAttribute="makerecipe" method="post" action="/addrecipe">
					<form:input class="inputBoxes" path="recipeName" placeholder="Enter recipe name"/><br>
					<form:input class="inputBoxes" path="text" placeholder="Enter recipe text"/>
					
					<!-- dropdown below -->
					<form:select path="etc.ingredientName" items="${ingredients}" />
				
					
					<div class="dropdown">
					<button onclick="myFunction()" class="dropbtn">Choose Ingredient</button>
					  <div id="myDropdown" class="dropdown-content">
					  	<c:forEach var="ingredient" items="${ingredients}">
					    <a href="ingredientName"><c:out value="${ingredient.ingredientName}"></c:out></a>
					    </c:forEach>
					    
					    
					    <!-- dropdown above -->
					  </div>
					</div>
					</form:form>
		
					<h1><br><c:out value="${rec.recipeName}"></c:out></h1>
						<c:forEach var="etcetera" items="${etceteraList}"> 
							<c:if test = "${etcetera.recipeName==rec.recipeName}">
							<c:if test = "${etcetera.ingredientName !='Total'}">
							<c:out value="${etcetera.ingredientName} ${etcetera.ingredientVolume} oz"></c:out><br>
							</c:if>
							<c:if test = "${etcetera.ingredientName =='Total'}">
							<c:out value="Total  ${etcetera.ingredientCalories} Cal, ${etcetera.ingredientProtein}g Protein, ${etcetera.ingredientCarbs}g Carbs, ${etcetera.ingredientFat}g Fat"></c:out>
							</c:if>
							</c:if>
						</c:forEach>
						
					<p><c:out value="${rec.text}"></c:out><p>
					</div>
				
				</div>
			</div>
			
		</div>
	</div>
</div>
<!-- end ****************************************************************************** -->
</body>
</html>