import java.util.ArrayList;
import java.util.Iterator;

class RemoveStudents {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Samuel");
        studentList.add("John");
        studentList.add("Sophia");
        studentList.add("Michael");
        studentList.add("Sophie");
        studentList.add("Alex");

        System.out.println("Original List of Students: " + studentList);

        // Remove students whose names start with 'S'
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            if (student.startsWith("S")) {
                iterator.remove();
            }
        }

        System.out.println("Updated List of Students (after removal): " + studentList);
    }
}
