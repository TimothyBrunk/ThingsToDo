<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" href="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRJel6OIeM4Z6sp13rKFMSQBdYJpJSXaXfmDYdDLmdPfDyKznfAwazmRw">
<link rel="stylesheet" type="text/css" href="index.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="entry" items="${list}">
	<br>
	
	<div class="list">
 	<input type="hidden"${entry.id}>Priority: ${entry.priority}<br><br> Task: ${entry.task} <br><br> Deadline: ${entry.deadline} <br><br> </div>         
 	<form action="toEditPage.do"> <input type="hidden"
			name="id" value="${entry.id}"> <input type="submit"
			value="edit">
		</form><br>
 	<form action="toDeleteTask.do"> <input type="hidden"
			name="id" value="${entry.id}"> <input type="submit"
			value="delete">
		</form>
		<br>
	</c:forEach>

	<button><a href="index.html">Go Home</a>
</body>
</html>