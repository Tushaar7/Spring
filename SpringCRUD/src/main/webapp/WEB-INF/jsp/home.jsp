<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Screen</title>
</head>
<body>
    <div align="center">
        <h1>Company List</h1>
        <h3>
            <a href="newEmployee">New Company</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Soft</th>
            <th>Telephone</th>
            <th>Action</th>
 
            <c:forEach var="employee" items="${listEmployee}">
                <tr>
 
                    <td>${employee.name}</td>
                    <td>${employee.soft}</td>
                    <td>${employee.telephone}</td>
                    <td><a href="editEmployee?id=${employee.id}">Edit</a>
                             <a
                        href="deleteEmployee?id=${employee.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
