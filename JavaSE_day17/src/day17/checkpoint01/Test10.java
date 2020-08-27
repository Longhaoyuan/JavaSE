package day17.checkpoint01;
/*
*递归10的阶乘
* */
public class Test10 {
  public static void main(String[] args) {
    System.out.println("10的阶乘是："+factorial(10));
  }
  public static int factorial(int num){
    if (num==1)
      return 1;
    else
      return num*factorial(--num);
  }
}
