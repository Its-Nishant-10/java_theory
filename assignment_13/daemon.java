class MyDaemon extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class daemon {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        MyDaemon t = new MyDaemon();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread finished");
    }
}