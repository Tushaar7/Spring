<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Data</title>
</head>
<body>

<div align="center">
<h1>${msg}</h1>

<%-- 
<form action="saveData">
<table>
	<tr>
		<td> Category </td>
		<td> <input type="text"> </td>
	</tr>
	
	<tr>
		<td colspan="2" align="center"> <input type="submit" value="Add"> </td>
	</tr>
</table>
</form>
 --%>
 
 <%-- 
<form:form action="saveData", modelAttribute="category">

<table>
       <form:hidden path="id"/>
	<tr>
		<td> Category </td>
		<td> <form:input path="cname"/> </td>
	</tr>
	
	<tr>
		<td colspan="2" align="center"> <input type="submit" value="Add"> </td>
	</tr>

 </table>
  </form:form> --%>
  
  
  
 <form action="saveData">
 
 <table>
 	<tr>
 		<td>Category</td>
 		<td> <input type="text" name="cname"> </td>
 	</tr>
 	
 	<tr>
 		<td colspan="2" align="center"> <input type="submit" value="Add"> </td>
 	</tr>
 
 </table>
 
 </form>
  
</div>
</body>
</html>