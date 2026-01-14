class Counte {
    static int count = 0;

    Counte() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counte c1 = new Counte();
        Counte c2 = new Counte();
        Counte c3 = new Counte();
    }
}