package day15;

/*
 * 要求使用两种方式实现：
 *    第一种方式：继承Thread类。
 *    第二种方法：实现Runnable接口。
 * */
public class Test03 {
  public static void main(String[] args) {
    new MyThread().start();
    new Thread(new MyRunnable()).start();
  }
}
class MyThread extends Thread{
  public MyThread() {
  }

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    super.run();
    System.out.println("该线程名："+super.getName());
  }
}
class MyRunnable implements Runnable{

  @Override
  public void run() {
    System.out.println("该线程名："+Thread.currentThread().getName());
  }
}
