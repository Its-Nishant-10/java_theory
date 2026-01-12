class DemoParseSplit {

    public static void main(String[] args) {
        String input = args[0];
        String[] parts = input.split(",");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        double c = Double.parseDouble(parts[2]);
        System.out.println("Sum of integers = " + (a + b));
        System.out.println("Double value = " + c);
    }
}
