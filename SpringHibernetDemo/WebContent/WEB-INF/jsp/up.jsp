<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="updD.html" commandName="registercmd">
<table>
<tr><td><label>
ENTER id:</label></td><td><s:input path="id" id="id"/></td></tr>
<tr><td><label>
ENTER NAME:</label></td><td><s:input path="sname" id="sname"/></td></tr><tr><td></td><td>
<input type="submit" value="update"></td></tr>
</table>
</s:form>
</body>
</html>