class StaticCounter {
    static int count = 0;
    static synchronized void increment() {
        count++;
        System.out.println("Static Count: " + count);
    }
}

class StaticSyncDemo {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    StaticCounter.increment();
                }
            }
        }.start();
        System.out.println("VENYA KEJRIWAL - 24155517");
    }
}
