<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div>
	<h3>Add Product</h3>
	<form action="AddProduct" method="get">
	  <label>Product Name</label><br>
	  <input type="text" name="name"><br>
	  <label>Category</label><br>
	  <input type="text" name="category"><br>
	  <label>Price</label><br>
	  <input type="text" name="price"><br><br>
	  <input type="submit" value="add Product">
	  <input type="reset">
	</form>
	</div>

</body>
</html>