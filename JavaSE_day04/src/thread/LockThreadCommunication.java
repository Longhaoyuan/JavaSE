package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//线程通信  使用lock实现线程通信
//使用监听器对象的 await（）让当前的线程等待
//signal（）唤醒另一个监听器的线程
public class LockThreadCommunication {
  static class Shower {
    ReentrantLock lock = new ReentrantLock();
    Condition c1;
    Condition c2;
    Condition c3;
    int count = 1;

    public Shower() {
      this.c1 = lock.newCondition();
      this.c2 = lock.newCondition();
      this.c3 = lock.newCondition();
    }

    public void show() throws InterruptedException {
      for (int i = 0; i < 5; i++) {
        lock.lock();
        while (count != 1) {
          c1.await();
        }
        Thread.sleep(10);
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者 ");
        count = 2;
        c2.signal();
        lock.unlock();
      }
    }

    public void show2() throws InterruptedException {
      for (int i = 0; i < 5; i++) {
        lock.lock();
        while (count != 2) {
          c2.await();
        }
        Thread.sleep(10);
        System.out.print("虽");
        System.out.print("远");
        System.out.print("必");
        System.out.println("诛");
        count = 1;
        c1.signal();
        lock.unlock();
      }
    }
  }

  public static void main(String[] args) {
    Shower shower = new Shower();
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          shower.show();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          shower.show2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }
}
