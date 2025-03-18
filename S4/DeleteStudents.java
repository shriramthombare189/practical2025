package S4;

import java.util.ArrayList;
import java.util.Iterator;

public class DeleteStudents {
    public static void main(String[] args) {
        // Create ArrayList to store students
        ArrayList<Student> students = new ArrayList<>();

        // Add sample students
        students.add(new Student("John", 101));
        students.add(new Student("Smith", 102));
        students.add(new Student("Sarah", 103));
        students.add(new Student("Mike", 104));
        students.add(new Student("Steve", 105));

        System.out.println("Original Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Delete students whose names start with 'S'
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().startsWith("S")) {
                iterator.remove();
            }
        }

        System.out.println("\nStudent List after deletion:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
