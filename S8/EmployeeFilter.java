package S8;

import java.util.ArrayList;

public class EmployeeFilter {
    public static void main(String[] args) {
        // Create ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Add sample employees
        employees.add(new Employee("Alex", 101));
        employees.add(new Employee("Bob", 102));
        employees.add(new Employee("Alice", 103));
        employees.add(new Employee("Charlie", 104));
        employees.add(new Employee("Amanda", 105));
        employees.add(new Employee("David", 106));
        employees.add(new Employee("Andrew", 107));

        System.out.println("All Employees whose names start with 'A':");
        System.out.println("----------------------------------------");
        
        // Filter and display employees with names starting with 'A'
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getName().startsWith("A")) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with names starting with 'A'");
        }
    }
}
