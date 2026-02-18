import java.io.*;

class AArraySort {
    public static void main(String[] args) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        FileOutputStream fout = new FileOutputStream("arr.txt");

        fout.write(55);
        fout.write(51);
        fout.write(57);
        fout.write(49);
        fout.write(53);

        fout.close();

        FileInputStream fin = new FileInputStream("arr.txt");

        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = fin.read() - 48;
        }

        fin.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        FileOutputStream fout2 = new FileOutputStream("sorted.txt");

        for (int i = 0; i < arr.length; i++) {
            fout2.write(arr[i] + 48);
        }

        fout2.close();

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
