package ThreadDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
* 使用Lock实现线程间的通信
* */
public class Test05 {
  public static void main(String[] args) {
    Methord methords = new Methord();
    new Thread(()->{
      try {
        methords.show();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();

    new Thread(()->{
      try {
        methords.show2();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();

    new Thread(()->{
      try {
        methords.show3();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
  }
}
class Methord{
  ReentrantLock lock = new ReentrantLock();//创建Lock对象
  int num =1;

  Condition c1 ;
  Condition c2 ;
  Condition c3 ;
  //使用构造方法给对象创建监听器
  public Methord() {
    this.c1 = lock.newCondition();
    this.c2 = lock.newCondition();
    this.c3 = lock.newCondition();
  }

  public void show() throws InterruptedException {
    lock.lock();
    for (int i = 0; i < 10; i++) {
      if (num!=1)
        c1.await();//开始监听
      System.out.print("我");
      System.out.print("是");
      System.out.print("中");
      System.out.print("国");
      System.out.print("人 ");
      num=2;
      Thread.sleep(1000);
      c1.signal();//唤醒其他线程
    }
    lock.unlock();
  }
  public void show2() throws InterruptedException {
    lock.lock();
    for (int i = 0; i < 10; i++) {
      if (num!=2)
        c1.await();//开始监听
      System.out.print("犯");
      System.out.print("我");
      System.out.print("中");
      System.out.print("华");
      System.out.print("者 ");
      Thread.sleep(1000);
      num=3;
      c1.signal();//唤醒其他线程
    }
    lock.unlock();
  }
  public void show3() throws InterruptedException {
    lock.lock();
    for (int i = 0; i < 10; i++) {
      if (num!=3)
        c1.await();//开始监听
      System.out.print("虽");
      System.out.print("远");
      System.out.print("必");
      System.out.println("诛");
      Thread.sleep(1000);
      num=1;
      c1.signal();//唤醒其他线程
    }
    lock.unlock();
  }
}
