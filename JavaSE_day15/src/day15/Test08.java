package day15;
/*
* 写一个卖票的程序，
* 1. 写一个类，该类继承Thread，定义一个变量记录总票数。
* 2. 开启四个卖票窗口(开始四个线程),同时执行卖票的程序。
* 要求每卖一张票在控制台输出：当前窗口为：窗口a卖了一张票，剩余票数为19。其中窗口a为线程的名字。
* */
public class Test08 {
  public static void main(String[] args) {
    SellTacket sellTacket = new SellTacket();
    new Thread(sellTacket,"A").start();
    new Thread(sellTacket,"B").start();
    new Thread(sellTacket,"C").start();
    new Thread(sellTacket,"D").start();
  }
}
class SellTacket implements Runnable{
  int tacketNum = 20;
  public static Object obj = new Object();
  static {
    System.out.println("总的票数是：20");
  }
  @Override
  public void run() {
    while (true){
      synchronized (obj){
        if (tacketNum<=0){
          break;
        }else {
         tacketNum--;
          System.out.println("窗口"+Thread.currentThread().getName()+"卖了一张票，剩余票数为"+tacketNum);
        }
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
