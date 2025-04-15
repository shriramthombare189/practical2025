<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Voter Eligibility Check</title>
</head>
<body>
    <h2>Voter Eligibility Form</h2>
    <form method="post">
        Name: <input type="text" name="name" required><br><br>
        Age: <input type="number" name="age" required><br><br>
        <input type="submit" value="Check Eligibility">
    </form>

    <%
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        if (name != null && ageStr != null) {
            int age = Integer.parseInt(ageStr);
            if (age >= 18) {
                out.println("<h3>Hello, " + name + "! You are eligible to vote.</h3>");
            } else {
                out.println("<h3>Sorry, " + name + ". You are not eligible to vote.</h3>");
            }
        }
    %>
</body>
</html>
