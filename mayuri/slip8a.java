import java.util.ArrayList;

class DisplayEmployees {
    public static void main(String[] args) {
        // Create an ArrayList to store employee names
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("Alice");
        employeeList.add("Bob");
        employeeList.add("Andrew");
        employeeList.add("John");
        employeeList.add("Anna");

        System.out.println("Employees whose names start with 'A':");

        // Iterate through the list and display names starting with 'A'
        for (String employee : employeeList) {
            if (employee.startsWith("A")) {
                System.out.println(employee);
            }
        }
    }
}
