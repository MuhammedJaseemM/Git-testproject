<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit product details</title>
</head>
<body>
Add Products
<form action="addproduct">
	Id<input type="text" name="id"><br>
	Name<input type="text" name="name"><br>
	Description<input type="text" name="description"><br>
	Price<input type="text" name="price"><br>
	<input type="submit"><br>
</form>
<br><br><br>
Get All Products
<form action="getproduct">
	<input type="submit"><br>
</form>
<br><br><br>
Get Product Based on Id
<form action="getproductid">
Id<input type="text" name="id"><br>
	<input type="submit"><br>
</form>
<br><br>
update a Product
<form action="updateproduct">
	Id<input type="text" name="id"><br>
	Name<input type="text" name="name"><br>
	Description<input type="text" name="description"><br>
	Price<input type="text" name="price"><br>
	<input type="submit"><br>
</form>
<br><br><br>
Delete Product 
<form action="delproduct">
Id<input type="text" name="id"><br>
	<input type="submit"><br>
</form>
<br><br>
</body>
</html>