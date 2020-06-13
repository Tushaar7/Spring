<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">	
</script>

<script src="js/bootstrap-datepicker.js"></script>

<script type="text/javascript"> 
            
        $(document).ready(function(){
           $('#date1').datepicker({dateFormat:'dd-mm-yy'});         
        });
        
        $(document).ready(function(){
            $('#date2').datepicker({dateFormat:'dd-mm-yy'});         
         });
        
    </script>
    
    
 <script type="text/javascript">

$(document).ready(function(){
	$("#checkbutton").click(function(){
		$("#reddiveid").show();

	});

});
</script>


</head>


<body>
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb"></div>
			<center>
			<h1>CHECKING AVAILABILITY</h1>
			</center>
		</div>
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<div class="span6">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i>
							</span>
							<h5>Cheking-info</h5>
						</div>
						<div class="widget-content nopadding">
						
							<form:form action="dateSaveAndCheck.html" method="post" class="form-horizontal">
							
							 <div class="control-group">
           				   <label class="control-label">Room No :</label>
     			         <div class="controls">
       			         <input type="text" name="room" id="room" class="span11" placeholder="Enter Room Number" />
       			       </div>
       			     </div>
							


								<div class="control-group">
									<label class="control-label">Check-In Date (dd-mm)</label>
									<div class="controls">
										<div data-date="12-02-2012"
											class="input-append date datepicker">
											<input name="date1" id="date1" type="text" value="${currentDate}" placeholder="DD-MM-YY"
												data-date-format="dd-mm-yyyy" class="span11"/> <span
												class="add-on"><i class="icon-th"></i></span>
										</div>
									</div>
								</div>

								<div class="control-group">
									<label class="control-label">Check-Out Picker (dd-mm)</label>
									<div class="controls">
										<div data-date="12-02-2012"
											class="input-append date datepicker">
											<input name="date2" id="date2" type="text" value="${currentDate}" placeholder="DD-MM-YY"
												data-date-format="dd-mm-yyyy" class="span11"/> <span
												class="add-on"><i class="icon-th"></i></span>
										</div>
									</div>
								</div>

										
								
									<div class="form-actions">
										<button type="submit" id="bookbutton" class="btn btn-success">Book</button>	
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<button type="submit" id="checkbutton" class="btn btn-success">Check</button>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<button type="submit" id="resetbutton" class="btn btn-success">Reset</button>
									</div>
										

							</form:form>
						</div>
					</div>
				</div>

				
<!-- 				
	===================================================================================================================================================================
	===================================================================================================================================================================		
				
 -->
 
 				<div class="span6" id="reddiveid">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-align-justify"></i>
							</span>
							<h5>Status</h5>
						</div>
						<div class="widget-content nopadding">
						
							<form:form action="" method="post" class="form-horizontal">
							
							 <div class="control-group">
           				   <label class="control-label">Room No: </label>
     			         <div class="controls">
       			         <span id=" " style="color:red;">${roomno} ${Message2} </span>
       			       </div>
       			     </div>
								<div class="control-group">
									<label class="control-label">Check-In: </label>
									<div class="controls">
										<div >
										  <span id=" " style="color:red;"> ${Message1} </span>
										</div>
									</div>
								</div>

								<div class="control-group">
									<label class="control-label">Check-Out : </label>
									<div class="controls">
										<div>
										  <span id=" " style="color:red;"> ${Message1} </span>
										 </div>
									</div>
								</div>

								

							</form:form>
				
				
				</div>
				</div>
				</div>


<!-- 				
	===================================================================================================================================================================
	===================================================================================================================================================================		
				
 -->
			
				
				
				
				
			</div>
		</div>
	</div>

</body>
</html>

