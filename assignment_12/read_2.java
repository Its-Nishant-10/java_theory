import java.io.*;

class AsciiDigit {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileOutputStream fout = new FileOutputStream("digit.txt");
        fout.write(50);
        fout.write(53);
        fout.close();
        FileInputStream fin = new FileInputStream("digit.txt");
        int d1 = fin.read() - 48;
        int d2 = fin.read() - 48;
        int number = d1 * 10 + d2;
        System.out.println("Number = " + number);
        fin.close();
    }
}
