package interfacedemo.impl;

import interfacedemo.InterFaceDemo;

/*
 *
 * 子类实现（implements）父接口
 * 子类需要重写接口中的所有抽象方法，
 * 如果不重写必须声明是抽象类
 * public abstract class InterFaceDemoImpl
 *
 *
 * //默认方法：如果多个父接口中具有相同名字的默认方法 必须重写方法
 *
 * //单继承多实现  先写继承后写实现
 *
 * //就近原则
 *
 * //接口可以实现多继承
 * */
public class InterFaceDemoImpl implements InterFaceDemo {

  @Override
  public void eat() {
    System.out.println("恰饭,"+InterFaceDemo.a);
  }

  @Override
  public void defaultMethod() {
    System.out.println("滚球");
  }
}
