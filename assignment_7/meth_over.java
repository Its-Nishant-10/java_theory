class A_3 {
    protected void msg() {
        System.out.println("Hello java");
    }
}

public class meth_over extends A_3 {
    void msg() {
        System.out.println("Hello java");
    }// C.T.Error

    public static void main(String args[]) {
        meth_over obj = new meth_over();
        obj.msg();
    }
}