<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body >
	<h3>Add Product</h3>

	<form action="FormData" method="post">
		<table>

			<tr>
				<td>ProductId:</td>
				<td><input type="text" name="ProductId" /></td>
			</tr>
			<tr>
				<td>ProductName:</td>
				<td><input type="text" name="ProductName" /></td>
			</tr>

		</table>

		<input type="submit" value="Submit Details">

	</form>

</body>
</html>
