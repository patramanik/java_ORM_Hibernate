<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<style>
    body {
        padding-top: 70px; /* For fixed navbar */
    }
    .card {
        transition: transform 0.2s;
    }
    .card:hover {
        transform: translateY(-5px);
    }
</style>
</head>
<body>
    <!-- Navigation Bar -->
    <%@ include file="navbar.jsp" %>

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8 text-center mb-5">
                <h1 class="display-4 mb-4">Welcome to Product Management</h1>
                <p class="lead text-muted">Manage your products efficiently and effectively</p>
            </div>
        </div>

        <div class="row justify-content-center">
            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card shadow">
                    <div class="card-body text-center">
                        <i class="fas fa-plus-circle fa-3x text-primary mb-3"></i>
                        <h3 class="card-title">Add New Product</h3>
                        <p class="card-text text-muted">Add new products to your inventory</p>
                        <a href="addProduct.jsp" class="btn btn-primary btn-lg">
                            <i class="fas fa-plus"></i> Add Product
                        </a>
                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card shadow">
                    <div class="card-body text-center">
                        <i class="fas fa-list-ul fa-3x text-success mb-3"></i>
                        <h3 class="card-title">View All Products</h3>
                        <p class="card-text text-muted">Browse and manage existing products</p>
                        <a href="DisplayAllServlet" class="btn btn-success btn-lg">
                            <i class="fas fa-list"></i> View Products
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>