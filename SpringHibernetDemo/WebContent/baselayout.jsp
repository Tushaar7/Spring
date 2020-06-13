<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true" />
</title>
</head>
<body>
<div id="mainContainer">
	<div style="width:100%; height:110px; margin:0px 0px 0px 0px; float:center; background-color: orange;">
		<tiles:insertAttribute name="header" />
	</div>
	
	<div style="width: 100%;  margin:10px 0px 0px 0px; float:left;">
		<tiles:insertAttribute name="menu" />
	</div>	
	<div class="container" style=" hight:100px; width: 100%; margin:0; float:left; ">
		<!-- <div class="errors" id="message" style="width: 400px; display: none;"></div> -->
		
		<tiles:insertAttribute name="body" />
	</div>
</div>
	<div style="margin: 10px 0px 0px 0px; height:50px; width: 100%; background:red; float:left; ">
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>