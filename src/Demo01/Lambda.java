package Demo01;

interface Task {
  public void task();
}

class Start implements Runnable{
  private Task task;
  public Start(Task task){
    this.task = task;
  }
  @Override
  public void run() {
    task.task();
  }

}
interface Cook{
  void makeFood();
}
public class Lambda {
  public static void main(String[] args) {
    //匿名内部类
   /* new Start(
      new Task() {
        @Override
        public void task() {
          System.out.println("开始任务啦");
        }
      }
    );*/

    /*new Start(()-> System.out.println("使用lambda表达式开启任务！")).run();*/
    /*invokeCook(()->{ System.out.println("吃饭啦！"); });*/
  }
}
