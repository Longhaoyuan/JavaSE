package day21;

import day21.utils.SaidHello;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Method;

/*
*   1. 定义一个类，在类中定义一个成员方法 show ，方法功能是：打印一个字符串。
    2. 使用反射机制创建该类的对象，并调用该对象的 show 方法。
* */
public class Test04 {
  static Class<SaidHello> clazz;

  @BeforeClass
  public static void createClass() {
    clazz = SaidHello.class;
  }

  @Test
  public void useShow() {
    try {
      SaidHello saidHello = clazz.newInstance();
      Method show = clazz.getDeclaredMethod("show");//利用反射获取show方法
      show.invoke(saidHello);//调用show方法
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
