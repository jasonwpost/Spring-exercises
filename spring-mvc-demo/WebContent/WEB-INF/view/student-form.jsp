<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<!-- Model attribute must match the same one given in the StudentController class -->
		<form:form action="processForm" modelAttribute="student">
		
		First Name: <form:input path="firstName" />
		<br><br>
		Last Name: <form:input path="lastName" />
		<br><br>
		Country: 
		
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br><br>
		Favourite Language:
		<br>
		Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		Go <form:radiobutton path="favouriteLanguage" value="Go"/>
		JavaScript <form:radiobutton path="favouriteLanguage" value="JavaScript"/>
		C++ <form:radiobutton path="favouriteLanguage" value="C++"/>
		<br><br>
		Operating System Experience: 
		<br>
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		MacOS <form:checkbox path="operatingSystems" value="MacOS" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		<br><br>
		<input type="submit" value="submit" />
		</form:form>
	</body>
</html>

