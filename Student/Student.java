package Student;

public class Student {
    private final int id;
    private final String name;
    private static String college = "BBDIT";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void changeCollege() {
        college = "CODEGYM";
    }
    public void display() {
        System.out.println("Student.Student id: " + id);
        System.out.println("Student.Student name: " + name);
    }
}



