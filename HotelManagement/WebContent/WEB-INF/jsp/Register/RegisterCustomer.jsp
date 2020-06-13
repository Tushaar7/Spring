

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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


</head>
<body>

<div id="content">
<div id="content-header">
  <div id="breadcrumb">  </div>
  <center>
  <h1>ROOM BOOKING</h1>
  </center>
</div>

<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Booking-info</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="" method="get" class="form-horizontal">
            
            <div class="control-group">
              <label class="control-label">First Name :</label>
              <div class="controls">
                <input type="text" name="firstname" id="firstname" class="span11" placeholder="First name" />
              </div>
            </div>
            
            <div class="control-group">
              <label class="control-label">Last Name :</label>
              <div class="controls">
                <input type="text" name="lastname" id="lastname" class="span11" placeholder="Last name" />
              </div>
            </div>
  
            <div class="control-group">
              <label class="control-label">Room No :</label>
              <div class="controls">
                <input type="text" name="roomno" id="roomno" class="span11" placeholder="Room Number" />
              </div>
            </div>
  
            <div class="control-group">
              <label class="control-label">Check-In Date :</label>
              <div class="controls">
                <input type="text" name="date1" id="date1" data-date-format="dd-mm-yyyy" class="span11" placeholder="DD-MM-YY" />
              </div>
            </div>
  
            <div class="control-group">
              <label class="control-label">Check-Out Date :</label>
              <div class="controls">
                <input type="text" name="date2" id="date2" data-date-format="dd-mm-yyyy" class="span11" placeholder="DD-MM-YY" />
              </div>
            </div>
  
            <div class="control-group">
              <label class="control-label">Address</label>
              <div class="controls">
                <textarea class="span11" ></textarea>
              </div>
            </div>
 
 			<center> 
            <div class="form-actions">
              <button type="submit" class="btn btn-success">Save</button>
            </div>
            </center>
          </form>
        </div>
      </div>
      


        </div>
      </div>
    </div>
  </div>
  
  

</body>
</html>