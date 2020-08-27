package day14.homeworkException.checkpoint02.com.xiaomi.level2_01;

import day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag.ToothPainException;

public class Father {
  public void eat() throws ToothPainException {
    System.out.println("吃到一个石子");
    throw new ToothPainException();
  }
  public void drink() {
    System.out.println("喝什么都没有问题");
  }
}
