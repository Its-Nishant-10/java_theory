class NStatic {

    int rollno;
    String name;
    int count = 0;

    NStatic(int r, String n) {
        rollno = r;
        name = n;
        count++;
    }

    void display() {
        System.out.println(rollno + " " + name + " count = " + count);
    }

    public static void main(String args[]) {

        NStatic s1 = new NStatic(111, "Karan");
        NStatic s2 = new NStatic(222, "Aryan");

        s1.display();
        s2.display();
    }
}
