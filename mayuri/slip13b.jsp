<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>College Details</title>
    <style>
        table {
            border-collapse: collapse;
            width: 60%;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #000;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #ccc;
        }
    </style>
</head>
<body>
    <h2>College Details</h2>

    <table>
        <tr>
            <th>College ID</th>
            <th>College Name</th>
            <th>Address</th>
        </tr>

        <%
            // Sample data
            String[][] colleges = {
                {"C101", "Green Valley College", "New York"},
                {"C102", "Riverdale Institute", "California"},
                {"C103", "Mountain View University", "Texas"}
            };

            for (int i = 0; i < colleges.length; i++) {
        %>
        <tr>
            <td><%= colleges[i][0] %></td>
            <td><%= colleges[i][1] %></td>
            <td><%= colleges[i][2] %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>