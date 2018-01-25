<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>License App</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class=container>
<div class=row>

<div class="col-sm-4"></div>
<div class="col-sm-4">

	<p>&nbsp;</p>
	<h3>New Person</h3>

	<form:form method="POST" action="/persons/new" modelAttribute="person">
		<p>
		<form:label path="firstName">First Name<br>
		<form:input path="firstName"/><br>
		<small style=color:red><form:errors path="firstName"/></small>
		</form:label>
		</p>
		<p>
		<form:label path="lastName">Last Name<br>
		<form:input path="lastName"/><br>
		<small style=color:red><form:errors path="lastName"/></small>
		</form:label>
		</p>
		<p><input class="btn btn-primary" type="submit" value="Create"/></p>
	</form:form>

</div>
<div class="col-sm-4"></div>

</div>
</div>
</body>
</html>