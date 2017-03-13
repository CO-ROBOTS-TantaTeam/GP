<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="POST" action="doRobotRegistration">
		<table border="0">
			<tr>Robot Garage
			</tr>
			<tr>
				<td>X Location</td>
				<td><input type="text" name="x_location" value="" /></td>
			</tr>
			<tr>
				<td>Y Location</td>
				<td><input type="text" name="y_location" value="" /></td>
			</tr>
			<tr>Robot Specification
			</tr>
			<tr>
				<td>Robot maximum load</td>
				<td><input type="text" name="max_load" value="" /></td>

			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/">Cancel</a></td>
			</tr>
		</table>
	</form>

</body>
</html>