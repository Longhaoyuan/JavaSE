package day21;

import day21.utils.A;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
* 1. 编写一个类A，定义一个实例方法 showString ，用于打印一个字符串。
  2. 在编写一个类TestA，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，并
     调用该对象中的方法showString
* */
public class Test05 {
  public static void main(String[] args) {
   System.out.println("请输入A类的全名：");
   String str = new Scanner(System.in).nextLine();
   try {
     Class<A> clazz = (Class<A>) Class.forName(str);
     A a = clazz.newInstance();
     Method showString = clazz.getMethod("showString");
     showString.invoke(a);
   } catch (Exception e) {
     e.printStackTrace();
   }
 }
}
