package day15;

/*
 * 1. 有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，
 * 并且分别统计卖了多少。请用线程进行模 拟并设置线程名称用来代
 * 表售出途径，再将信息打印出来。 比如（实体店卖出第1个，总共剩余n个..）
 * */
public class Test06 {
  public static void main(String[] args) {
    SellCup sellCup = new SellCup();
    new Thread(sellCup, "实体店").start();
    new Thread(sellCup, "官网").start();
  }
}

class SellCup implements Runnable {
  int cupNum = 100;
  //锁对象
  private static Object obj = new Object();
  static {
    System.out.println("当前的背着有80个");
  }
  @Override
  public void run() {
    while (true) {
      synchronized (obj) {
        if (cupNum <= 0)
          break;
        else {
          cupNum--;
          System.out.println(Thread.currentThread().getName() + "卖出了1个,剩余" + cupNum);
        }
        try {
          Thread.sleep(200);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
