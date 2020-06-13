<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h1> Student Registration Form</h1>
							<form:form modelAttribute="studentForm" method="post"
								action="insert">
	<form:input type="hidden" path="id" readonly="true" />
								<br>
								<br>
		First Name:<form:input path="name" type="text" />
								<br>
								<br>
		
		Mobile:<form:input path="mobile" type="text" />
								<br>
								<br>

								<c:forEach items="${studentForm.addresses}" var="address"
									varStatus="row">
			
			<form:input type="hidden" path="addresses[${row.index}].aid"
										readonly="true" />
			
			
			Address :<form:input path="addresses[${row.index}].address"
										type="text" />
								</c:forEach>


								<br>
								<form:input path="" type="submit" value="submit" />
							</form:form>

<br>
<br>
<table border="0" bordercolor="red">
  <thead>
	            <tr>
				<th>ID</th>
				<th>Name</th>
			    <th>Mobile</th>
				<th>Address</th>
				<th>address</th>
				<th>edit</th>
				<th>delete</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${studentFormList}" var="st">
				<tr>
				<td>${st.id}</td>
				<td>${st.name}</td>
				<td>${st.mobile}</td>
				<c:forEach items="${st.addresses}" var="addr">
                <td>${addr.address}</td>
                </c:forEach>

				<td><a href="edit?id=${st.id}">edit</a></td>
				<td><a href="delete?id=${st.id}">delete</a></td>
				</tr>
				</c:forEach>
			    </tbody>
				</table>
				</center>
</body>
</html>