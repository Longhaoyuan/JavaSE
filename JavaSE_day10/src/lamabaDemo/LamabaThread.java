package lamabaDemo;

public class LamabaThread {
  public static void main(String[] args) {
    new Thread(()->{
      System.out.println(Thread.currentThread().getName()+"开启新线程....");
    }).start();
  }
}
