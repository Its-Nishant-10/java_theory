class pvt {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }

}

public class pvt_1 {

    public static void main(String args[]) {
        pvt obj = new pvt();
        System.out.println(obj.data);// Compile Time Error
        obj.msg();// Compile Time Error
    }
}