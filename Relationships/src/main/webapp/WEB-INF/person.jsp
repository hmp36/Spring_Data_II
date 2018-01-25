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
	<h3>${person.firstName} ${person.lastName}</h3>

	<p>License Number: ${license.number}</p>
	<p>State: ${license.state}</p>
	<p>Expiration Date: <fmt:formatDate pattern = "MM/dd/yyyy" 
         value="${license.expiration}"/></p>

</div>
<div class="col-sm-4"></div>

</div>
</div>
</body>
</html>
