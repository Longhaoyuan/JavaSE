package lamabaDemo;

interface Work {
  public void cook();
}
interface Sum{
  int count(int a,int b);
}
class Job {
  private Work work;

  public Job(Work work) {
    this.work = work;
  }

  public void run() {
    work.cook();
  }
}

public class LamabaDemo01 {
  public static void main(String[] args) {
    new Job(() -> System.out.println("hello")).run();

    sum(145,545,(int a,int b)->{return a+b;});
  }
  public static void sum(int num1,int num2,Sum sum){
    int s= sum.count(num1,num2);
    System.out.println("两个数的和为"+s);
  }
}
