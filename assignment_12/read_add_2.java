import java.io.*;
class AAddition {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileOutputStream fout = new FileOutputStream("num.dat");
        fout.write(52);
        fout.write(55);
        fout.write(54);
        fout.write(56);
        fout.close();
        FileInputStream fin = new FileInputStream("num.dat");
        int a1 = fin.read() - 48;
        int a2 = fin.read() - 48;
        int num1 = a1 * 10 + a2;
        int b1 = fin.read() - 48;
        int b2 = fin.read() - 48;
        int num2 = b1 * 10 + b2;
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Sum = " + (num1 + num2));
        fin.close();
    }
}