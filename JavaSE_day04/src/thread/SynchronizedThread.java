package thread;

import java.util.concurrent.locks.ReentrantLock;

//同步锁
class Ticket implements Runnable{
  //票数
  private static Integer TICKET = 100;

  //锁对象
  private static Object obj = new Object();

  @Override
  public void run() {
    while (true){
      synchronized (this){
        if (TICKET<=0){
          break;
        }
        System.out.println(Thread.currentThread().getName() + "正在卖第: " + (101-TICKET) + "张票");TICKET--;
      }
      }
  }
}
class Ticket1 implements Runnable{
  //票数
  private static Integer TICKET = 100;

  //锁对象
  ReentrantLock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true){
        lock.lock();
        if (TICKET<=0){
          break;
        }
        System.out.println(Thread.currentThread().getName() + "正在卖第: " + (101-TICKET) + "张票");TICKET--;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      lock.unlock();
    }
  }
}
public class SynchronizedThread {
  public static void main(String[] args) {
    Ticket1 ticket=new Ticket1(); //开启三个窗口,买票
    Thread t1=new Thread(ticket,"南昌西站");
    Thread t2=new Thread(ticket,"南昌东站");
    Thread t3=new Thread(ticket,"南昌站");
    t1.start();
    t2.start();
    t3.start();
  }
}
