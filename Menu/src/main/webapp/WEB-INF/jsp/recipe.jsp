<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">		
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">
<title>Social Network</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div class="container home-container">
	<div class="container text-container">
		<div class="row">
			
		<br><br><br>
		<div class="col-sm-7">
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-default text-left">
						<div class="panel-body">
							<br><br>
							<form:input type="text" path="recipeName" class="form-control" 
									placeholder="RecipeName"></form:input>
								<button type="submit" class="btn btn-default btn-sm"></button>
							<form:form method="POST" modelAttribute="post" action="post">
								<form:input type="text" path="message" class="form-control" 
									placeholder="Recipe instructions go here..."></form:input>
								<br><br>
								<form:input type="hidden" path="email" value="${loggedInUser.email}" class="form-control"></form:input>
<div class="container">
  <h2>Recipes</h2>
                                           
  <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">carrots</a></li>
      <li><a href="#">stew</a></li>
      <li><a href="#">water</a></li>
    </ul>
  </div>
</div>
<c:forEach var="rec" items="${recipies}">
			<div class="row">
				<div class="col-sm-3">		
					<div class="well">
						<br>
						<p><a href="#"><c:out value="${rec.recipeName}"></c:out></a></p>
						
						<img src="\\img\\background.jpg" 
							class="img-circle" height="55" width="55" alt="picture">
					</div>	
				</div>
				<div class="col-sm-9">
					<div class="well">
						<c:forEach var="etcetera" items="${etceteraList}"> 
<c:if test = "${etcetera.recipeName==rec.recipeName}">
	<p><c:out value="${etcetera}"></c:out></p>
	</c:if>
	</c:forEach>
	<p><c:out value="${rec.text}"></c:out><p>
	<button type="button" class="btn btn-default btn-sm"></button>
</c:forEach>

		<div class="col-sm-7">
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-default text-left">
						<div class="panel-body">
							<br><br>
							<form:form method="POST" modelAttribute="recipie" action="post">
								<form:input type="text" path="text" class="form-control" 
									placeholder="Recipe instructions go here..."></form:input>
								<br><br>
								<form:input type="hidden" path="email" value="${loggedInUser.email}" class="form-control"></form:input>

								<button type="submit" class="btn btn-default btn-sm">
									<span class="glyphicon"></span>Post
								</button>
							</form:form>
						</div>
					</div>	
				</div>
			</div>
		</div>
<!-- like button below -->
<button type="button" class="btn btn-default btn-sm">
<span class="glphicon glyphicon-thumbs-up"></span>like</button>

								<button type="submit" class="btn btn-default btn-sm">
									<span class="glyphicon"></span>Post
								</button>
							</form:form>
						</div>
					</div>	
				</div>
			</div>
		</div>
</body>