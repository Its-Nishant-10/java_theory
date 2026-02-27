class MyPriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

class priority {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        MyPriorityThread t1 = new MyPriorityThread();
        MyPriorityThread t2 = new MyPriorityThread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}