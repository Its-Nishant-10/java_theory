class MathOp_1 {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOp_1 m = new MathOp_1();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(1, 2, 3));
    }
}
