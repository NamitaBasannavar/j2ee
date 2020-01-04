<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				<td><c:out value="969143"></c:out></td>

			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" value="John" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><label for="rdMale">Male</label><input type="radio"
					id="rdMale" name="rdGender" value="Male"> <label
					for="rdFemale">Female</label><input type="radio" id="rdFemale"
					name="rdGender" value="Female"></td>
			</tr>
			<tr>
				<td>DateofBirth</td>
				<td><input type="text" value="08/07/1987" /></td>
			</tr>
			<tr>
				<td>Fulltime Employee</td>
				<td><input type="checkbox" /></td>
			</tr>


		</table>
</body>
</html>