<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<form action="EmployeeDetails" method="get">
		<table>
			<tr>
				<td>Id</td>
				<td><c:out value="${employee.id}"></c:out></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" value="John" /></td>
			</tr>
			<td>Gender</td>
			<td><label for="rdMale">Male</label><input type="radio"
				id="rdMale" name="rdGender" value="Male"> <label
				for="rdFemale">Female</label><input type="radio" id="rdFemale"
				name="rdGender" value="Female"></td>
		</table>
	</form>

</body>
</html>