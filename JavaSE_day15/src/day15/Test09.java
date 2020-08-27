package day15;
/*
* 1. 开启三个线程，分别执行以下三个运算，并将运算结果输出到控制台。
*   一个线程计算10!
*   一个线程计算5!
*   一个线程计算8!
* */
public class Test09 {
  public static void main(String[] args) {
    new Thread(new Factorial(10)).start();
    new Thread(new Factorial(8)).start();
    new Thread(new Factorial(5)).start();
  }
}

class Factorial implements Runnable{
  int num;

  public Factorial() {
  }

  public Factorial(int num) {
    this.num = num;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    int count = 1;
    for (int i = 1; i <= num; i++) {
      count*=i;
    }
    System.out.println(num+"的阶乘为："+count);
  }
}
