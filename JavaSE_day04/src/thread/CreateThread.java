package thread;

import java.util.concurrent.*;

/*
*
* 创建线程的三种方法
* */
//继承Thread类
class MyThread extends Thread{
  @Override
  public void run() {
    super.run();
    for (int i = 0; i < 2; i++) {
      try {
        System.out.println("You are loser!!!");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
//实现Runnable接口
class MyThread1 implements Runnable{

  @Override
  public void run() {
    try {
      System.out.println("I am a Winner!!!");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
//实现callable接口
class MyThread2 implements Callable<Integer>{
  @Override
  public Integer call() throws Exception {
    System.out.println("Keep up the good work!!!");
    return 1314;
  }
}
public class CreateThread {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    //创建线程
    new MyThread().run();
    //创建线程
    MyThread1 myThread1 = new MyThread1();
    new Thread(myThread1).start();
    //使用ExecutorService创建线程池
    ExecutorService service = Executors.newSingleThreadExecutor();
    MyThread2 myThread2 = new MyThread2();
    //给线程池分布任务
    Future<Integer> submit = service.submit(myThread2);
    int num = submit.get();
    System.out.println(num);
    service.shutdown();
  }
}
