package day15;

/*
 * 1. 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
 *  这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒。
 * 随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名。
 * */
public class Test05 {
  public static void main(String[] args) {
    OverTheCave overTheCave = new OverTheCave();
    String[] names = {"甲骨域","门西那","解卡西","鲁希冯","王路飞","所哥隆","杰特尼","马甲云","辛特希","嘉庚"};
    for (int i = 0; i <names.length; i++) {
      try {
        new Thread(overTheCave,names[i]).start();
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
class OverTheCave implements Runnable {
  private static Object obj = new Object();
  @Override
  public void run() {
    synchronized (obj) {
      System.out.println(Thread.currentThread().getName() + "在过山洞");
    }
  }
}
