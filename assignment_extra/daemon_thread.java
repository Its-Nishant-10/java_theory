class daemon_1 extends Thread {
   public void run() {
      while (true) {
         System.out.println("Daemon working...");
      }
   }

   public static void main(String[] args) {
      daemon_1 t = new daemon_1();
      t.setDaemon(true);
      t.start();
      System.out.println("VENYA KEJRIWAL - 24155517");
   }
}