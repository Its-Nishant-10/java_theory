class JoinDemo extends Thread {
   public void run() {
      for (int i = 1; i <= 3; i++) {
         System.out.println(getName() + " : " + i);
      }
   }

   public static void main(String[] args) throws InterruptedException {
      JoinDemo t1 = new JoinDemo();
      JoinDemo t2 = new JoinDemo();
      t1.start();
      t1.join();
      t2.start();
      System.out.println("VENYA KEJRIWAL - 24155517");
   }
}