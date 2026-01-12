class SStatic {
    int rollno;
    String name;
    static int count = 0;

    SStatic(int r, String n) {
        rollno = r;
        name = n;
        count++;
    }

    void display() {
        System.out.println(rollno + " " + name + " count = " + count);
    }

    public static void main(String args[]) {
        SStatic s1 = new SStatic(111, "Karan");
        SStatic s2 = new SStatic(222, "Aryan");
        s1.display();
        s2.display();
    }
}