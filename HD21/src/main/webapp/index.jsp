<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Student Management System</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <!-- Custom CSS -->
    <style>
        .main-content {
            min-height: calc(100vh - 120px);
        }
        .feature-card {
            transition: transform 0.3s;
        }
        .feature-card:hover {
            transform: translateY(-5px);
        }
        .nav-icon {
            margin-right: 8px;
            font-size: 0.9rem;
        }
        .feature-icon {
            font-size: 2rem;
            margin-bottom: 1rem;
            color: #0d6efd;
        }
        .welcome-icon {
            font-size: 2.5rem;
            vertical-align: middle;
        }
    </style>
</head>
<body class="d-flex flex-column min-vh-100">

<%@ include file="navebar.jsp" %>
    
    <!-- Main Content -->
    <main class="main-content">
        <div class="container py-5">
            <div class="text-center mb-5">
                <h1 class="display-5 mb-3">
                    <i class="fas fa-university text-primary welcome-icon"></i> Welcome to Student Management
                </h1>
                <p class="lead text-muted">Efficiently manage student records and course information</p>
            </div>

            <div class="row g-4">
                <div class="col-md-4">
                    <div class="card feature-card h-100 shadow">
                        <div class="card-body text-center">
                            <div class="feature-icon">
                                <i class="fas fa-user-plus fa-2x"></i>
                            </div>
                            <h5 class="card-title">Add New Student</h5>
                            <p class="card-text text-muted">Register new students into the system</p>
                            <a href="addStudent.jsp" class="btn btn-primary btn-sm">
                                <i class="fas fa-plus-circle me-2"></i>Go to Form
                            </a>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="card feature-card h-100 shadow">
                        <div class="card-body text-center">
                            <div class="feature-icon">
                                <i class="fas fa-users fa-2x"></i>
                            </div>
                            <h5 class="card-title">View Students</h5>
                            <p class="card-text text-muted">Browse all registered students</p>
                            <a href="DisplayAllStudent" class="btn btn-primary btn-sm">
                                <i class="fas fa-list me-2"></i>View List
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="card feature-card h-100 shadow">
                        <div class="card-body text-center">
                            <div class="feature-icon">
                                <i class="fas fa-book-open fa-2x"></i>
                            </div>
                            <h5 class="card-title">View Courses</h5>
                            <p class="card-text text-muted">Check available courses</p>
                            <a href="DisplayALLCourse" class="btn btn-primary btn-sm">
                                <i class="fas fa-eye me-2"></i>View Courses
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <!-- Footer -->
    <footer class="mt-auto bg-dark text-white py-4">
        <div class="container text-center">
            <p class="mb-0 small">
                <i class="fas fa-graduation-cap me-2"></i>&copy; 2025 Student Management System
            </p>
        </div>
    </footer>

    <!-- Bootstrap 5 JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>