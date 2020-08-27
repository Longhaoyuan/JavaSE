package ThreadDemo;

/*
 * Object线程间的通信
 * */
public class Test04 {
  public static void main(String[] args) {
    Object obj = new Object();
    Methods methods = new Methods();
    new Thread(() -> {
      try {
        methods.show();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    ).start();
    new Thread(() -> {
      try {
        methods.show2();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
  }

}

class Methods {
  int count = 1;
  static Object obj = new Object();

  public void show() throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      synchronized (obj) {
        while (count != 1) {
          try {
            obj.wait();
            //如果没时间限制则会无限等待，直到有线程唤醒才能执行
            //如果有时间限制，比如5000，再这期间如果有线程唤醒则直接醒来，如果没有则5000毫秒后直接醒来
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者 ");
        count = 2;
        obj.notify();
        Thread.sleep(1000);
      }
    }
  }
  public void show2() throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      synchronized (obj) {
        while (count != 2) {
          try {
            obj.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.print("虽");
        System.out.print("远");
        System.out.print("必");
        System.out.println("诛");
        count = 1;
        obj.notify();
        Thread.sleep(1000);
      }
    }
  }
}


