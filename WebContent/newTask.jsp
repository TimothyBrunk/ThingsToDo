<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRJel6OIeM4Z6sp13rKFMSQBdYJpJSXaXfmDYdDLmdPfDyKznfAwazmRw">
<link rel="stylesheet" type="text/css" href="index.css">
<meta charset="UTF-8">
<title>Check It Off</title>
</head>
<body>
	<h3 class="AddTask" > Add Task:</h3>
	<form  action="AddTask.do" method="POST">
		Priority:
		<select required name="priority" size="1" >
  <option></option>	

  <option value="urgent">urgent</option> 	
  <option value="important">important</option>
  <option value="somewhat">somewhat</option>
  <option value="eehh">eehh</option>
  </select>
		Task:
		<input type="text" name="task" size="45" placeholder="Enter New Task"/> 
		Deadline:
		<input type="text" name="deadline" size="45" placeholder="Enter New Deadline"/>
		<br>
		<input type="submit" value="Add Task" >
	</form>
	<button><a class="home" href="index.html">Go Home</a>
</body>
</html>