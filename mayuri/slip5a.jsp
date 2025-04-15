<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sum of First and Last Digit</title>
</head>
<body>
    <form method="post">
        <label for="number">Enter a number:</label>
        <input type="text" id="number" name="number">
        <input type="submit" value="Calculate">
    </form>

    <%
        String numStr = request.getParameter("number");
        if (numStr != null && !numStr.isEmpty()) {
            try {
                int number = Integer.parseInt(numStr);
                int firstDigit = Integer.parseInt(String.valueOf(numStr.charAt(0)));
                int lastDigit = Integer.parseInt(String.valueOf(numStr.charAt(numStr.length() - 1)));
                int sum = firstDigit + lastDigit;

                // Display the result
    %>
                <p style="color: red; font-size: 18px;">The sum of the first and last digit is: <%= sum %></p>
    <%
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Invalid input! Please enter a valid number.</p>");
            }
        }
    %>
</body>
</html>