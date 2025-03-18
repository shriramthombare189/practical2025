package S4;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}
