package classdemo;

import classdemo.entities.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Constructor;

/*
*Constructor类中常用方法
* */
public class ConstructorMethod {
  static Class<Student> clazz;
  @BeforeClass
  public static void before() throws ClassNotFoundException {
    clazz = (Class<Student>) Class.forName("classdemo.entities.Student");
  }
  @Test
  public void getPublicConstructorMethods(){  //反射所有public 修饰的构造方法
    System.out.println("获取所有public的构造方法");
    Constructor<?>[] constructors = clazz.getConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor);
    }
  }
  @Test
  public void getAllConstructorMethods(){   //反射所有的构造方法
    System.out.println("获取所有构造方法");
    Constructor<?>[] constructors = clazz.getDeclaredConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor);
    }
  }
  @Test
  public void getPrivateConstructorMethod() throws Exception {   //反射私有的的构造方法
    System.out.println("获取所有构造方法");
    Constructor<Student> constructors = clazz.getDeclaredConstructor(String.class,String.class);
   //暴力反射，除了public外其他的反射都需要暴力反射
    constructors.setAccessible(true);
    //创建元素
    Student student = constructors.newInstance("马云", "男");
    System.out.println(student);
  }
  @Test
  public void getProtectedConstructorMethod() throws Exception {   //反射保护的的的构造方法
    System.out.println("获取所有构造方法");
    Constructor<Student> constructors = clazz.getDeclaredConstructor(String.class);
    //暴力反射，除了public外其他的反射都需要暴力反射
    constructors.setAccessible(true);//不写会爆java.lang.IllegalAccessException的错误
    //创建元素
    Student student = constructors.newInstance("马化腾");
    System.out.println(student);
  }
  @Test
  public void getPublicConstructorMethod() throws Exception {   //反射保护的的的构造方法
    System.out.println("获取所有构造方法");
    Constructor<Student> constructors = clazz.getDeclaredConstructor(String.class,String.class,Integer.class);
    //暴力反射，除了public外其他的反射都需要暴力反射
//    constructors.setAccessible(true);//不写会爆java.lang.IllegalAccessException的错误
    //创建元素
    Student student = constructors.newInstance("马化腾","男",18);
    System.out.println(student);
  }
}
