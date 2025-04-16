<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-sm" style="max-width: 500px; margin: 0 auto;">
        <div class="card-header bg-primary text-white">
            <h2 class="mb-0">Update Product</h2>
        </div>
        <div class="card-body">
        
        <%
        	int id = Integer.parseInt(request.getParameter("id"));
        	String name = request.getParameter("name");
        	String category = request.getParameter("category");
        	int price = Integer.parseInt(request.getParameter("price"));
        	int quantity = Integer.parseInt(request.getParameter("quantity"));
        	
        	System.out.println("Edit product jsp");
        %>
        
            <form action="EditProductServlet" method="get">
            	<input type="hidden" name="id" value="<%=id %>">
            
                <div class="mb-3">
                    <label for="name" class="form-label">Name:</label>
                    <input type="text" class="form-control" id="name" name="name" value="<%=name %>" required>
                </div>
                
                <div class="mb-3">
                    <label for="category" class="form-label">Category:</label>
                    <input type="text" class="form-control" id="category" name="category" value="<%=category %>" required>
                </div>
                
                <div class="mb-3">
                    <label for="price" class="form-label">Price:</label>
                    <input type="number" class="form-control" id="price" name="price" step="0.01" value="<%=price %>" required>
                </div>
                
                <div class="mb-3">
                    <label for="quantity" class="form-label">Quantity:</label>
                    <input type="number" class="form-control" id="quantity" name="quantity" value="<%=quantity %>" required>
                </div>
                
                <div class="d-flex justify-content-end gap-2">
                    <button type="submit" class="btn btn-primary">Update Product</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>
        </div>
    </div>
</div>
<% 
System.out.println("Edit product jsp");
%>

<!-- Bootstrap JS and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>