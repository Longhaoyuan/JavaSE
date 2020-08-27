import java.util.concurrent.CountDownLatch;

public class ThreadPoolDemo {
  public static void main(String[] args) {
//    ExecutorService service = Executors.newCachedThreadPool();
    CountDownLatch countDownLatch = new CountDownLatch(1);
    MyRunnable myRunnable = new MyRunnable(countDownLatch);

    for (int i = 0; i < 100; i++) {
      new Thread(myRunnable,"Thread"+i).start();
    }
    countDownLatch.countDown();
  }
}
class MyRunnable implements Runnable{
  CountDownLatch countDownLatch;

  public MyRunnable(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    try {
      countDownLatch.await();
      System.out.println(Thread.currentThread().getName() + "," + System.currentTimeMillis());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
