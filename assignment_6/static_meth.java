class Student_1 {
    int rollno;
    String name;
    static String college = "KIIT";

    static void change() {
        college = "KISS";
    }

    Student_1(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student_1.change();
        Student_1 s1 = new Student_1(111, "Karan");
        Student_1 s2 = new Student_1(222, "Aryan");
        Student_1 s3 = new Student_1(333, "Laxman");
        s1.display();
        s2.display();
        s3.display();
    }
}