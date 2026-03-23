package bt03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("Nhập thông tin của sinh viên (Dừng lại nếu bạn nhập id = -1)");
        while(true) {
            System.out.println("==============================");
            System.out.print("ID: ");
            String a = sc.nextLine();
            if (a.trim().equals("-1")) break;
            System.out.print("fullName: ");
            String b = sc.nextLine();
            System.out.print("age: ");
            int c = Integer.parseInt(sc.nextLine());
            double d;
            do {
                System.out.print("gpa: ");
                d = Double.parseDouble(sc.nextLine());
                if (d < Student.getMIN_GPA() || d > Student.getMAX_GPA()) {
                    System.out.println("Vui lòng nhập đúng GPA");
                }
            } while (d < Student.getMIN_GPA() || d > Student.getMAX_GPA());
            Student s = new Student(a, b, c, d);
            list.add(s);
        }
        System.out.println("===== THÔNG TIN DANH SÁCH SINH VIÊN =====");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Sinh viên thứ " + (i+1) + ":");
            list.get(i).printInfo();
        }
        System.out.println("Tổng số sinh viên: " + Student.getCount());
    }
}
