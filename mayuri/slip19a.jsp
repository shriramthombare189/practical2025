<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
    <title>Greeting Program</title>
</head>
<body>
    <h1>Welcome!</h1>
    <form method="post">
        Enter your username: <input type="text" name="username" />
        <input type="submit" value="Greet Me" />
    </form>

    <%
        String username = request.getParameter("username");
        if (username != null && !username.trim().isEmpty()) {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);

            String greeting;
            if (hour >= 5 && hour < 12) {
                greeting = "Good Morning";
            } else if (hour >= 12 && hour < 17) {
                greeting = "Good Afternoon";
            } else if (hour >= 17 && hour < 21) {
                greeting = "Good Evening";
            } else {
                greeting = "Good Night";
            }

            out.println("<h2>" + greeting + ", " + username + "!</h2>");
        }
    %>
</body>
</html>
