package day16;

import java.util.Random;
import java.util.concurrent.*;

/*
*
* 1. 使用线程池,分别开启三条线程,生成10个1到100的随机数,
* 然后计算他们的平均数, 最后计算这三个平均数的平 均数.(使用Callable)
* */
public class Test03 {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    MyCallable myCallable = new MyCallable();
   /* Future submit = service.submit(myCallable);
    Future submit2 = service.submit(myCallable);
    Future submit3 = service.submit(myCallable);*/
    Integer i = (Integer) service.submit(myCallable).get();
    Integer i2 = (Integer) service.submit(myCallable).get();
    Integer i3 = (Integer) service.submit(myCallable).get();
    System.out.println("这三个数分别是："+i+" "+i2+" "+i3);
    System.out.println("平均数是："+(i+i2+i3)/3);
    //不使用必须关闭线程池
    service.shutdown();
  }
}
class MyCallable implements Callable{
  Random random = new Random();
  @Override
  public Object call() throws Exception {
    return random.nextInt(99)+1;
  }
}
