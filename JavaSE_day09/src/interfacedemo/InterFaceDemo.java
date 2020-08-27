package interfacedemo;
/*
*     抽象类不是类不能用class修饰
*     可以包含抽方法  默认方法 私有方法 静态方法
* */
public interface InterFaceDemo {

  public final static int a =45;
  //抽象方法
  public abstract void eat();

  //默认方法
  //必须有方法体
  public default void defaultMethod() {
    System.out.println("默认方法");
  }

  //私有方法（1.9）
  /*private void method(){

  };*/

  //静态方法
  public static void staticMethod(){

  };

}
