package day21;

import day21.entities.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Constructor;

/*
* 定义一个Student类，用反射去创建一个Student对象，使用两种方式
    1. 通过Class对象的方法创建。
    2. 通过Constructor对象的方法创建。
* */
public class Test03 {
  static Class<Student> clazz;
  @BeforeClass
  public static void createClass(){
    clazz = Student.class;
  }
  @Test
  public void methodOne(){
   /* Class<Student> clazz=Student.class;*/
    System.out.println("使用Class类的方法创建对象");
    try {
      Student o = clazz.newInstance();
      o.setNeme("马云");
      o.setAge(45);
      o.setSex("男");
      System.out.println(o);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  @Test
  public void methodTwo(){
    /*Class<Student> clazz=Student.class;*/
    System.out.println("使用Constructor对象的方法创建对象");
    try {
      Constructor<Student> dc = clazz.getDeclaredConstructor(String.class, String.class, int.class);
      dc.setAccessible(true);
      Student student = dc.newInstance("马化腾", "男", 42);
      System.out.println(student);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
