package ThreadDemo;
/*
* */
public class Test03 {
  public static void main(String[] args) {
    Thread t1 = new Thread(()->{
      for (int i = 0; i < 100; i++) {
        System.out.println("a"+i);
      }
    });
    Thread t2 = new Thread(()->{
      for (int i = 0; i < 100; i++) {
        System.out.println("b"+i);
        if (i>10)
          Thread.yield();//礼让
      }
    });
    t1.start();
    t1.setPriority(9);
    t2.start();
    t2.setPriority(8);
  }
}
