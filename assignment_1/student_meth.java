package assignment_1;

import java.util.Scanner;

public class student_meth {
    int id;
    String name;

    void insert() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Student ID");
        id = scan.nextInt();
        System.out.println("Enter the Student name");
        name = scan.next();
    }

    void display() {
        System.out.println(name + " " + id);
    }

    public static void main(String args[]) {
        student_meth s1 = new student_meth();
        s1.insert();
        student_meth s2 = new student_meth();
        s2.insert();
        System.out.println("Nishant Nahar -- 241551078");
        System.out.println("The Student Details are - ");
        s1.display();
        s2.display();
    }
}
