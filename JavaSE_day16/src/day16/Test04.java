package day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 1. 使用线程池：
  * 一个线程计算10! ，
  * 一个线程计算5!，
  * 一个线程计算8!
* 打印在那个线程执行的和执行结果.(使用 Runnable)
* */
public class Test04 {
  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(3);
    //给线程添加任务
    service.submit(new Calculation(10));
    service.submit(new Calculation(8));
    service.submit(new Calculation(5));

    //关闭线程池
    service.shutdown();
  }
}
class Calculation implements Runnable{
  int num;
  public Calculation(int num) {
    this.num = num;
  }

  public Calculation() {
  }

  @Override
  public void run() {
    int count=1;
    for (int i = 1; i <= num; i++) {
      count*=i;
    }
    System.out.println(num+"的阶乘等于："+count);
  }
}
