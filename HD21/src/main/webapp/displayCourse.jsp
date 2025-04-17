<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.demo.entity.Course" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Course List</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        .main-content {
            flex: 1;
            margin-bottom: 60px;
        }
        .fixed-footer {
            position: fixed;
            bottom: 0;
            width: 100%;
            height: 60px;
        }
    </style>
</head>
<body class="d-flex flex-column min-vh-100">
    <!-- Navbar -->
    <%@ include file="navebar.jsp" %>
    
    <!--main-content  -->
    <main class="main-content">
       <div class="container mt-5">
    <div class="card shadow-sm">
        <div class="card-header bg-primary text-white d-flex justify-content-between align-items-center">
            <h2 class="mb-0">Product List</h2>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-striped table-hover table-bordered">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                        List<Course> list = (List<Course>)request.getAttribute("courseList");
                        for(Course c : list){
                        %>
                        <tr>
                            <td><%= c.getId() %></td>
                            <td><%= c.getName() %></td>
                            <td>
                                <div class="btn-group" role="group">
                                    <a href="editCourse.jsp?id=<%=c.getId() %>&name=<%=c.getName()%>" class="btn btn-sm btn-primary mx-1">
                                        <i class="bi bi-pencil"></i> Edit
                                    </a>
                                    <a href="DeleteCourseServlet?id=<%=c.getId() %>" class="btn btn-sm btn-danger mx-1" onclick="return confirm('Are you sure you want to delete this user?');">
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
    </main>

    <!-- Fixed Footer -->
	<%@ include file="footer.jsp" %>

    <!-- Bootstrap 5 JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>