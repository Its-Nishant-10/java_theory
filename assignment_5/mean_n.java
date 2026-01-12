class Mean {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        double mean = (double) sum / args.length;
        System.out.println("Mean = " + mean);
    }
}
