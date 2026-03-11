class syn {
    int count = 0;

    synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

class SynchronizedThreadDemo {
    public static void main(String[] args) {
        syn c = new syn();

        new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    c.increment();
                }
            }
        }.start();
        System.out.println("VENYA KEJRIWAL - 24155517");
    }
}
