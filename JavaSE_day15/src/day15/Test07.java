package day15;

/*
* 1. 有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，如果坐满则不能再上车。
* 请用线程模拟上车过程并且在控制台打印出是从哪个车门上车以及剩下的座位数。 比如:（前门上车---还剩N个座...）
* */
public class Test07 {
  public static void main(String[] args) {
    Boarding boarding = new Boarding();
    new Thread(boarding,"前门").start();
    new Thread(boarding,"中门").start();
    new Thread(boarding,"后门").start();
  }
}
class Boarding implements Runnable{
  int remainingSeats = 80;
  public static Object object = new Object();
  static {
    System.out.println("当前的座位是80个");
  }
  @Override
  public void run() {
    while (true){
      synchronized (object){
        if (remainingSeats<=0){
          break;
        }else {
          remainingSeats--;
          System.out.println(Thread.currentThread().getName()+"上车，---还剩"+remainingSeats+"个座...");
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
