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
	        <div class="row justify-content-center"> <!-- Added justify-content-center row -->
	            <div class="col-12 col-md-8 col-lg-6"> <!-- Responsive column sizing -->
	                <div class="card shadow-sm">
	                    <div class="card-header bg-primary text-white d-flex justify-content-between align-items-center">
	                        <h2 class="mb-0">Course List</h2>
	                    </div>
	                    <div class="card-body p-0"> <!-- Remove card body padding -->
	                        <div class="table-responsive">
	                            <table class="table table-striped table-hover table-bordered m-0">
	                                <thead class="thead-dark">
	                                    <tr class="text-center"> <!-- Center header content -->
	                                        <th class="w-25">ID</th> <!-- Width control -->
	                                        <th class="w-75">Name</th>
	                                    </tr>
	                                </thead>
	                                <tbody>
	                                    <% 
	                                    List<Course> list = (List<Course>)request.getAttribute("courseList");
	                                    for(Course c : list){
	                                    %>
	                                    <tr>
	                                        <td class="text-center"><%= c.getId() %></td>
	                                        <td class="text-center"><%= c.getName() %></td>
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
	        </div>
	    </div>
	</main>
    
    <!-- Fixed Footer -->
	<%@ include file="footer.jsp" %>

    <!-- Bootstrap 5 JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>