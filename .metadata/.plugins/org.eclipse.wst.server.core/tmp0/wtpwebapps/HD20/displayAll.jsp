<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.demo.entity.Product" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display All Products</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap Icons -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-sm">
        <div class="card-header bg-primary text-white d-flex justify-content-between align-items-center">
            <h2 class="mb-0">Product List</h2>
            <a href="addProduct.jsp" class="btn btn-light">
                <i class="bi bi-plus-circle"></i> Add Product
            </a>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-striped table-hover table-bordered">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Category</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                        List<Product> list = (List<Product>)request.getAttribute("list");
                        for(Product p : list){
                        %>
                        <tr>
                            <td><%= p.getId() %></td>
                            <td><%= p.getName() %></td>
                            <td><%= p.getCategory() %></td>
                            <td><%= p.getPrice()%></td>
                            <td><%= p.getQuantity() %></td>
                            <td>
                                <div class="btn-group" role="group">
                                    <a href="editProduct.jsp?id=<%=p.getId() %>&name=<%=p.getName()%>&category=<%=p.getCategory()%>&price=<%=p.getPrice()%>&quantity=<%=p.getQuantity()%>" class="btn btn-sm btn-primary mx-1">
                                        <i class="bi bi-pencil"></i> Edit
                                    </a>
                                    <a href="DeleteProductServlet?id=<%=p.getId() %>" class="btn btn-sm btn-danger mx-1" onclick="return confirm('Are you sure you want to delete this user?');">
                                        <i class="bi bi-trash"></i> Delete
                                    </a>
                                </div>
                            </td>
                        </tr>
                        <% 
                        }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>