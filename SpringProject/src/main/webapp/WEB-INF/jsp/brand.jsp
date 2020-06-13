<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Brand</title>

</head>

<body>
	<div align="center">
		<h1>Add Brand</h1>




<%-- 
<form:label path="category">Brand</form:label>

<form:select path="category">

			<option value="-1">Select type</option>
			<c:forEach item="${ }" var="b"></c:forEach>

</form:select>


 --%>
 
 
 		Category <select>
 		
			<option value="category"></option>

		</select> <br> Brand <input type="text" name="bname">
 
 </div>
</body>
</html>
