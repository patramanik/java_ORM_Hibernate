<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container-sm mt-4" style="max-width: 500px;">
        <div class="card shadow-sm">
            <div class="card-header bg-primary p-3">
                <h4 class="mb-0 text-white">New Student</h4>
            </div>
            <div class="card-body p-3">
                <form action="AddStudentServlet" method="post">
                    <div class="mb-2">
                        <label class="form-label small">Name:</label>
                        <input type="text" class="form-control form-control-sm" name="name" required>
                    </div>
                    
                    <div class="mb-2">
                        <label class="form-label small">Email:</label>
                        <input type="email" class="form-control form-control-sm" name="email" required>
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label small">Course:</label>
                        <input type="text" class="form-control form-control-sm" name="course" required>
                    </div>

                    <div class="d-flex justify-content-between align-items-center">
                        <a href="index.jsp" class="btn btn-link small text-decoration-none">Back to home</a>
                        <div>
                            <button type="reset" class="btn btn-sm btn-outline-secondary">Clear</button>
                            <button type="submit" class="btn btn-sm btn-primary">Save</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>