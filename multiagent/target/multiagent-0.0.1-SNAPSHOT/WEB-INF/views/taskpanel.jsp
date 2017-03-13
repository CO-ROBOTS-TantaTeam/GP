<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Task Panel</title>
</head>
<body>
	<form method="POST" action="locRobotLoad">

		<table border="0">
			<tr>
				<td>Robot destination</td>
			</tr>
			<tr>
				<td>x:</td>
				<td><input type="text" name="x" value="" /></td>
			</tr>

			<tr>
				<td>y:</td>
				<td><input type="text" name="y" value="" /></td>
			</tr>

			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>

			<tr>
				<td>Load destination</td>
			</tr>
			<tr>
				<td>x:</td>
				<td><input type="text" name="x" value="" /></td>
			</tr>

			<tr>
				<td>y:</td>
				<td><input type="text" name="y" value="" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/">Cancel</a></td>
			</tr>
		</table>
	</form>
</body>
</html>