package ThreadDemo;

public class Test07 implements Runnable {
  public static void main(String[] args) {
    Thread t = new Thread(new Test07());
    t.start();
  }
//Runnable只有public void run()方法
  public void run(int num) {
    for (int i = 0; i < num; i++) {
      System.out.println(i);
    }
  }

  @Override
  public void run() {

  }
}
