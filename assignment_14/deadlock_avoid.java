class NoDeadlockExample {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        new Thread() {
            public void run() {
                synchronized(lock1) {
                    try { Thread.sleep(50); } catch(Exception e) {}
                    synchronized(lock2) {
                        System.out.println("Thread 1 finished safely");
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized(lock1) {  // same order
                    try { Thread.sleep(50); } catch(Exception e) {}
                    synchronized(lock2) {
                        System.out.println("Thread 2 finished safely");
                    }
                }
            }
        }.start();
        System.out.println("VENYA KEJRIWAL - 24155517");
    }
}
