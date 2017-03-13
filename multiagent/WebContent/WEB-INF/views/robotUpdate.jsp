<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>


	<link href="style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="style/css/bootstrap.min.css">
	
	
    <link href="style/css/freelancer.css" rel="stylesheet">
    <link href="style/css/customCSS.css" rel="stylesheet">
	
	<link href="style/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">



</head>
<body>




<section>
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>Robots</h2>
		            <hr class="star-primary">
		        </div>
			</div>
		
			<table class="table table-striped table-bordered">
				<thead  class="fa-lg ">
					<tr class="bg-success">
		
					<th>X Location</th>
					<th>Y Location</th>
					<th>Max load</th>
					<th>Update</th>
					</tr>
				</thead>
				<tbody class="fa-ul">
				<c:forEach items="${robotData}" var="r">
				<tr>
				
				<td>${r.xLocation}</td>
				<td>${r.yLocation}</td>
				<td>${r.maxLoad}</td>
				<td><a href="RobotDoDelete?id=${r.id}">Update</a></td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
	
	
	
		    <!-- jQuery -->
    <script src="style/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="style/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="style/js/jqBootstrapValidation.js"></script>
    <script src="style/js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="style/js/freelancer.min.js"></script>



</body>
</html>