<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Perfect Number Checker</title>
</head>
<body>

    <h2>Perfect Number Checker</h2>
    <form method="post">
        Enter a number: <input type="text" name="num" required>
        <input type="submit" value="Check">
    </form>

    <%
        // Get the number from the form
        String numStr = request.getParameter("num");
        if (numStr != null) {
            int num = Integer.parseInt(numStr);
            int sum = 0;

            // Calculate sum of divisors
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            // Check if the number is perfect
            if (sum == num) {
                out.println("<h3>" + num + " is a Perfect Number.</h3>");
            } else {
                out.println("<h3>" + num + " is NOT a Perfect Number.</h3>");
            }
        }
    %>

</body>
</html>
