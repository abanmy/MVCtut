<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

	<title>Student Registrastion Form</title>

</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name <form:input path="firstName"/>
	
		<br><br>
	
		Last name <form:input path="lastName"/>
	
		<br><br>
		
		country
		<form:select path="country"> 
		
		<form:options items= "${student.countries}"/>
		
		</form:select>
		
		<br><br>
		
		<br><br> 
		Favorite programming language : 
		<br>
		<form:radiobuttons path="language" items="${student.languages}"/>
		
		
		<br><br>
		Favorite fruits :
		<form:checkboxes items="${student.fruits}" path="fruit"/>
		
		
		<br><br>
		
		<input type="submit" value="Submit" />
	
	</form:form>


</body>
</html>