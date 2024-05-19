<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>

<form:form action = "log" method = "post" modelAttribute = "custObj">
Username: <form:input path = "custId"/><br>
Password: <form:input path = "custName"/><br>
Address: <form:input path = "address"/><br>
<input type = "submit" name= "SignIn"/><br>
</form:form>

</body>
</html>