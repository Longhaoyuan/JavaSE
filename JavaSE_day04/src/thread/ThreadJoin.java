package thread;
//线程的join（）方法，线程加入，把执行权交给加入的线程
public class ThreadJoin {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("你好，" + 1 + "哥");
        Thread.yield();
      }
    });
    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          if (i == 3) {
            try {
              thread1.join(3000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          } else
            System.out.println("线程" + i);
        }
      }
    });

    thread2.start();
    thread1.start();
  }
}
