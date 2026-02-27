class Table_1 {
    void printTable(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread_1 extends Thread {
    Table_1 t; // Changed from Table to Table_1

    MyThread_1(Table_1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread_2 extends Thread {
    Table_1 t; // Changed from Table to Table_1

    MyThread_2(Table_1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization1 {
    public static void main(String args[]) {
        Table_1 obj = new Table_1();//only one object
        MyThread_1 t1 = new MyThread_1(obj);
        MyThread_2 t2 = new MyThread_2(obj);
        t1.start();
        t2.start();
    }
}