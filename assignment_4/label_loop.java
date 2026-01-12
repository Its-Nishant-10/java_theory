public static void main(String[] args) {
    System.out.println("Nishant Nahar -- 241551078");
    System.out.println("When we Break the bb label");
    for (int i = 1; i <= 3; i++) {
        bb: for (int j = 1; j <= 3; j++) {
            if (i == 2 && j == 2) {
                break bb;
            }
            System.out.println(i + " " + j);
        }
    }
    System.out.println("When we Break the aa label");
    aa: for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
            if (i == 2 && j == 2) {
                break aa;
            }
            System.out.println(i + " " + j);

        }

    }
}
