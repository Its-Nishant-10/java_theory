class inter extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted but continues...");
            }
        }
        System.out.println("Thread finished normally");
    }
}

class InterruptDemo {
    public static void main(String[] args){
        inter t = new inter();
        t.start();

        try { Thread.sleep(2000); } catch(Exception e) {}
        t.interrupt();
        System.out.println("VENYA KEJRIWAL - 24155517");
    }
}
