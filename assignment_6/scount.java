class Counte {
    static int count = 0;

    Counte() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        new Counte();
        new Counte();
        new Counte();
    }
}