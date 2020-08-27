package ThreadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class Test06 {
  public static void main(String[] args) {
    SellTacket sellTacket = new SellTacket();
    new Thread(sellTacket,"西门").start();
    new Thread(sellTacket,"东门").start();
    new Thread(sellTacket,"北门").start();
  }
}

class SellTacket implements Runnable{
  ReentrantLock lock = new ReentrantLock();
  int num=100;
  @Override
  public void run() {
    while (true) {
      synchronized (Object.class) {
        lock.lock();
        if (num <= 0) {
          System.out.println("票已卖完");
          break;
        }
        System.out.println(Thread.currentThread().getName() + "正在买票，剩余票：" + num);
        num--;
        lock.unlock();
      }
    }
  }
}
