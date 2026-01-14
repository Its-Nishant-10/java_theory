class ppp1 {
    void msg(){System.out.println("parent");}
}

class TestExceptionChild1 extends ppp1 {
    void msg()throws ArithmeticException{
        System.out.println("child");
    }
    public static void main(String args[]){
        ppp1 p=new TestExceptionChild1();
        p.msg();
    }
}
