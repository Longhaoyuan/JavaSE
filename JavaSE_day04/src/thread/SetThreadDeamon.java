package thread;

//守护线程
public class SetThreadDeamon {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new Runnable() {
      Object obj = new Object();
      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          synchronized (obj) {
            System.out.println("守护线程1：" + i);
          }
        }
      }
    });
    thread1.setDaemon(true);

    Thread thread2 = new Thread(new Runnable() {
      Object obj = new Object();
      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          synchronized (obj) {
            System.out.println("用户线程1：" + i);
          }
        }
      }
    });
    Thread thread3 = new Thread(new Runnable() {
      Object obj = new Object();
      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          synchronized (obj) {
            System.out.println("用户线程2：" + i);
          }
        }
      }
    });
    thread1.setPriority(10);
    thread1.start();
    thread2.start();
    thread3.start();
  }
}
