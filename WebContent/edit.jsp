<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" href="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRJel6OIeM4Z6sp13rKFMSQBdYJpJSXaXfmDYdDLmdPfDyKznfAwazmRw">
<link rel="stylesheet" type="text/css" href="index.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Check It Off</title>
<h3 class="edit" >Edit Task:</h3>
</head>
<body>
<body>
<br>
<br>
<br>



<form action="EditTask.do">
	<input type="hidden" name="id" value="${entry.id}"/> 
	Priority: 
	<select required name="priority" size="1" >
  <option></option>	
  <option value="urgent">urgent</option> 	
  <option value="important">important</option>
  <option value="somewhat">somewhat</option>
  <option value="eehh">eehh</option>
  </select>Task:
 <input type ="text" name="task" value ="${entry.task}" size="45"/> Deadline: <input type ="text" name="deadline" value ="${entry.deadline}" /> <br>
 
 <form action="editTask.do" method="POST" > <input type="submit" name="edit" value="Save">
   <input type="hidden" > </input>
   </form> <br>

	
	<button><a href="index.html">Go Home</a>
</body>
</html>

</body>
</html>