class MathOp {

    MathOp(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    MathOp(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args) {
        new MathOp(2, 3);
        new MathOp(1, 2, 3);
    }
}
