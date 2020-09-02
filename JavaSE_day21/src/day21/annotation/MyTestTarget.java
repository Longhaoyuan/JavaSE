package day21.annotation;

public class MyTestTarget {
  @MyTest
  public void fun1(){
    System.out.println("我是方法一");
  }
  @MyTest
  public void fun2(){
    System.out.println("我是方法二");
  }

  public void fun3(){
    System.out.println("我是方法三");
  }
}
