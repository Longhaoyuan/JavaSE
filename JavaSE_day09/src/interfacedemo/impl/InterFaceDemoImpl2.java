package interfacedemo.impl;

import interfacedemo.InterFaceDemo;

public class InterFaceDemoImpl2 implements InterFaceDemo {
  @Override
  public void eat() {
    System.out.println("吃啥呢");
  }

  @Override
  public void defaultMethod() {
    System.out.println("吃饭咯");
  }
}
