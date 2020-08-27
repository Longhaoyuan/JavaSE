package day14.homeworkException.checkpoint02.com.xiaomi.level2_01;

import day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag.TonguePainException;
import day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag.ToothPainException;


public class Test01 {
  public static void main(String[] args) throws ToothPainException, TonguePainException {
    Father father = new Father();
//    father.eat();
    father.drink();
    Son son = new Son();
//    son.eat();
    son.drink();
  }
}
