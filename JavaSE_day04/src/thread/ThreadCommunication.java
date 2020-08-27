package thread;

//线程通信  wait()方法释放锁 需要和synchronized配合使用
//          notify（）唤醒随机的锁，wait方法与notify方法必须要在同步代码块或者是同步函数中使用。因为：必须要通过锁对象调用这2个方 法
public class ThreadCommunication {
  static class Shower{
    int count = 1;

    public void show()throws InterruptedException{
      for (int i = 0; i < 5; i++) {
        synchronized (Object.class){
          while (count!=1){
            Object.class.wait();
          }
          Thread.sleep(10);
          System.out.print("犯");
          System.out.print("我");
          System.out.print("中");
          System.out.print("华");
          System.out.print("者 ");
          count=2;
          Object.class.notify();
        }
      }
    }
    public void show2()throws InterruptedException{
      for (int i = 0; i < 5; i++) {
        synchronized (Object.class){
          while (count!=2){
            Object.class.wait();
          }
          Thread.sleep(10);
          System.out.print("虽");
          System.out.print("远");
          System.out.print("必");
          System.out.println("诛");
          count=1;
          Object.class.notify();
        }
      }
    }
  }
  public static void main(String[] args) {
    Shower shower = new Shower();
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          shower.show();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          shower.show2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }
}
