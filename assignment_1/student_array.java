package assignment_1;

import java.util.Scanner;

public class student_array {
    int id;
    String name;

    void insert(Scanner scan) {
        System.out.print("Enter the Student ID");
        id = scan.nextInt();
        System.out.print("Enter the Student name");
        name = scan.next();
    }

    void display() {
        System.out.println(name + ", ID is: " + id);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        student_array arr[] = new student_array[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = new student_array();
            arr[i].insert(scan);
        }
        System.out.println("Nishant Nahar -- 241551078");
        System.out.println("The Student Details are - ");

        for (int i = 0; i < 10; i++) {
            arr[i].display();
        }
        scan.close();
    }
}
