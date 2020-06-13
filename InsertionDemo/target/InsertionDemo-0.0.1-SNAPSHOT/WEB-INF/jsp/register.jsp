<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fill Form</title>
</head>
<body>

<form:form modelAttribute="student" commandName="student" action="saveStudent.htm">
<c:out value="${msg}"></c:out>

<table>
	<tr>
		<td> Name: </td>
		<td> <form:input path="text" path="name"/> </td>
	</tr>
	
		<tr>
		<td> Address: </td>
		<td> <form:input path="text" path="addr"/> </td>
	</tr>
	
		<tr>
		<td> Phone: </td>
		<td> <form:input path="text" path="ph"/> </td>
	</tr>
	
		<tr>
			<td colspan="2"> <input type="submit" value="Save"> </td>
	</tr>
	
</table>
</form:form>
</body>
</html>