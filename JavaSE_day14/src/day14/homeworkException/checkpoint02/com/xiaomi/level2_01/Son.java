package day14.homeworkException.checkpoint02.com.xiaomi.level2_01;

import day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag.BigToothPainException;
import day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag.TonguePainException;
import day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag.ToothPainException;

public class Son extends Father {
  @Override
  public void drink() {
    super.drink();
    try {
      System.out.println("输出喝到了100度的水");
      throw new TonguePainException("舌头疼");
    } catch (TonguePainException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void eat() throws ToothPainException {
//    super.eat();
      System.out.println("大牙疼了");
      throw new BigToothPainException("大牙疼了");
//
//   throw new TonguePainException();
  }
}
