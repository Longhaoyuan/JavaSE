package ThreadDemo;
/*
 * join（）方法
 * */

public class Test02 {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println("aaa"+i);
        try {
          Thread.sleep(2);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println("bbb"+i);
        if (i > 20) {
          try {
            thread.join(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });
    thread2.start();
    thread.start();
  }
}
