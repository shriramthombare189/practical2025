<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Email Validation</title>
</head>
<body>
    <h2>Email Validation Example</h2>
    <form method="post">
        <label for="email">Enter Email ID:</label>
        <input type="text" id="email" name="email">
        <button type="submit">Validate</button>
    </form>

    <% 
        if(request.getMethod().equalsIgnoreCase("POST")) {
            String email = request.getParameter("email");
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            
            if(email.matches(emailRegex)) {
                out.println("<p style='color:green;'>Valid Email ID!</p>");
            } else {
                out.println("<p style='color:red;'>Invalid Email ID!</p>");
            }
        }
    %>
</body>
</html>
