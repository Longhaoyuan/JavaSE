package ThreadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
  public static void main(String[] args) {
    ExecutorService service = Executors.newSingleThreadExecutor();//使用Executors的方法调用
    MyCallable myCallable = new MyCallable();
    Future submit = service.submit(myCallable);
    System.out.println(submit);
    service.shutdown();//需要关闭线程池
  }
}

class MyCallable implements Callable{

  @Override
  public Object call() throws Exception {
    System.out.println("你个大憨批");
    return "131";
  }
}
