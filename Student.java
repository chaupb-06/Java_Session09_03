package bt03;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private double gpa;
    private static int count = 0;
    private static final double MIN_GPA = 0.0;
    private static final double MAX_GPA = 4.0;

    public static double getMIN_GPA() {
        return MIN_GPA;
    }

    public static double getMAX_GPA() {
        return MAX_GPA;
    }

    public Student() {
        count++;
    }
    public Student(String id, String fullName, int age, double gpa) {
        this();
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
    }
    public void printInfo() {
        System.out.println("ID: " + id + ", fullName: " + fullName + ", age: " + age + ", gpa: " + gpa);
    }
    public static int getCount() {
        return count;
    }
}
