<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Info</title>
</head>
<body>

<div align="center">
<h1>Add/Edit Company</h1>

<form:form action="saveCompany" method="post" modelAttribute="company"> 

<table>
	<form:hidden path="id"/>
	
	 <tr>
          <td>Comapany Name:</td>
          <td><form:input path="cname" /></td>
     </tr>
     
     	 <tr>
          <td>Software Name:</td>
          <td><form:input path="soft" /></td>
     </tr>
     
     	 <tr>
          <td>Telephone:</td>
          <td><form:input path="telephone" /></td>
     </tr>
     
     <tr>
         <td colspan="2" align="center"><input type="submit" value="Save"></td>
    </tr>
     
</table>
</form:form>
</div>

</body>
</html>