class CheckInterrupt extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Count: " + i);

            if(isInterrupted()) {
                System.out.println("Detected interrupt using isInterrupted()");
            }

            try { Thread.sleep(1000); }
            catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
                System.out.println("Thread interrupted status using interrupted(): " + Thread.interrupted());
            }
        }
    }
}

class InterruptCheckDemo {
    public static void main(String[] args){
        CheckInterrupt t = new CheckInterrupt();
        t.start();

        try { Thread.sleep(2500); } catch(Exception e) {}
        t.interrupt();
        System.out.println("VENYA KEJRIWAL - 24155517");
    }
}
