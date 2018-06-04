<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC for Text field form</title>
<style >
.error {color:red}
</style>
</head>
<body>
	<form:form action="processcustomer" modelAttribute="customer">
		First Name : <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		<br>
		<Br>
		Last Name : <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br>
		<Br>
		Age : <form:input path="age"/>
		<form:errors path="age" cssClass="error"/>
		<br>
		<Br>
		Dept. Namw : <form:input path="dept"/>
		<form:errors path="dept" cssClass="error"/>
		<br>
		<Br>
		<input type="submit" value="Submit"/>
 		 
	</form:form>
</body>
</html>