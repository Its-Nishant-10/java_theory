class Counter {
    int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        new Counter();
        new Counter();
        new Counter();
    }
}