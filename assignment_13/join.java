class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Nishant Nahar - 241551078");
        inter t1 = new inter();
        inter t2 = new inter();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t1.join();
        t2.start();
    }
}
