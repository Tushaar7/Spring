<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Category</title>
</head>
<body>

<div align="center">

<h1>Select Your Categories</h1>

<li class="panel">

<a href="javascript:;" data-parent="#side" data-toggle="collapse" class="accordion-toggle" data-target="#ui-elements">


<i class="fa fa-wrench"></i> Categories <i class="fa fa-caret-down"></i>
</a>

<ul class="collapse nav" id="ui-elements">

<li>
<a href="mobile.jsp"> <i class="fa fa-angle-double-right"></i> Mobile </a>
</li>

<li>
 <a href="charger.jsp">
   <i class="fa fa-angle-double-right"></i> Charger
       </a>
    </li>

</ul>

</div>

</body>
</html>