package S8;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
