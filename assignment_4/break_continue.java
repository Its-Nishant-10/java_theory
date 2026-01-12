public static void main(String[] args) {
    System.out.println("Nishant Nahar -- 241551078");
    System.out.println("When we use break");
    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            break;
        }
        System.out.println(i);
    }
    System.out.println("When we use continue");
    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            continue;
        }
        System.out.println(i);

    }
}