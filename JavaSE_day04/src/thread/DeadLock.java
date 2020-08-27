package thread;
//死锁，使用同一类的锁进行嵌套就会可能导致产生死锁
public class DeadLock {
  public static void main(String[] args) {
    String s1 = "455";
    String s2 ="688";

    new Thread(new Runnable() {
      @Override
      public void run() {
        while (true){
          synchronized (s1){
            System.out.println(this.getClass().getName()+"1s1");
            synchronized (s2){
              System.out.println(this.getClass().getName()+"1s2");
            }
          }
        }
      }
    }).start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        while (true){
          synchronized (s1){
            System.out.println("2s1");
            synchronized (s2){
              System.out.println(this.getClass().getName()+"2s2");
            }
          }
        }
      }
    }).start();
  }
}
