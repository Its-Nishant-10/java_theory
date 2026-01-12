class Largest {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest = " + max);
    }
}
