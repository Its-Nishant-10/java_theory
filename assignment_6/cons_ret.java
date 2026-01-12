class Test {

    // Will store 'this' from constructor
    static Test insideConstructor;

    public Test() {
        insideConstructor = this; // capture current object
    }

    public static void main(String[] args) {

        // Object creation
        Test outsideConstructor = new Test();

        // Reference comparison (true = same object)
        System.out.println(outsideConstructor == insideConstructor);
    }
}
