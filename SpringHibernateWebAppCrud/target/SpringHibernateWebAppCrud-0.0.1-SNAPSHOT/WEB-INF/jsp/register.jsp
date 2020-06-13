<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelattribute="student" commandName="student" action="saveStudent">

<c:out value=${msg} />

<table>
<tr>

<td>StudentId:</td>
<td><form:input type="number" path="studId"/></td>
</tr>

<td>First Name:</td>
<td><form:input type="text" path="firstname"/></td>
</tr>

<td>Last Name:</td>
<td><form:input type="text" path="lastname"/></td>
</tr>

<tr colspan="2">
<td>
<input type="submit" value="Save">
</td>

</tr>
</table>
</form:form>
</body>
</html>