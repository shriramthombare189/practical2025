package S9;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDB {
    private static final String URL = "jdbc:mysql://localhost:3306/employeedb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver with better error handling
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("MySQL JDBC Driver loaded successfully");
            } catch (ClassNotFoundException e) {
                System.out.println("\nError: MySQL JDBC Driver not found!");
                System.out.println("Please follow these steps to fix:");
                System.out.println("1. Download MySQL Connector/J from: https://dev.mysql.com/downloads/connector/j/");
                System.out.println("2. Create a 'lib' folder in your project directory");
                System.out.println("3. Copy mysql-connector-j-8.x.x.jar to the lib folder");
                System.out.println("4. Run the program again\n");
                return;
            }
            
            // Create connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            // Create table if not exists
            createTable(conn);
            
            // Insert sample records
            insertEmployees(conn);
            
            // Display all records
            displayEmployees(conn);
            
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void createTable(Connection conn) throws SQLException {
        String createTableSQL = 
            "CREATE TABLE IF NOT EXISTS Emp (" +
            "ENo INT PRIMARY KEY, " +
            "EName VARCHAR(50), " +
            "Sal DECIMAL(10,2))";
            
        try (PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {
            pstmt.execute();
            System.out.println("Table created successfully");
        }
    }
    
    private static void insertEmployees(Connection conn) throws SQLException {
        String insertSQL = "INSERT INTO Emp (ENo, EName, Sal) VALUES (?, ?, ?)";
        Scanner scanner = new Scanner(System.in);
        
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            while (true) {
                System.out.println("\nEnter employee details (or -1 to stop):");
                
                System.out.print("Employee Number: ");
                int eno = scanner.nextInt();
                if (eno == -1) break;
                
                System.out.print("Employee Name: ");
                String ename = scanner.next();
                
                System.out.print("Salary: ");
                double sal = scanner.nextDouble();
                
                pstmt.setInt(1, eno);
                pstmt.setString(2, ename);
                pstmt.setDouble(3, sal);
                
                int result = pstmt.executeUpdate();
                if (result > 0) {
                    System.out.println("Record inserted successfully");
                }
            }
        }
    }
    
    private static void displayEmployees(Connection conn) throws SQLException {
        String selectSQL = "SELECT * FROM Emp";
        
        try (PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {
            
            System.out.println("\nEmployee Records:");
            System.out.println("------------------");
            System.out.printf("%-5s %-20s %-10s%n", "ENo", "EName", "Salary");
            System.out.println("------------------");
            
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-10.2f%n",
                    rs.getInt("ENo"),
                    rs.getString("EName"),
                    rs.getDouble("Sal"));
            }
        }
    }
}
