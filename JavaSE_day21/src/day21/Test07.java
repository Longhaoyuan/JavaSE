package day21;

import day21.entities.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
*   1. 定义一个Person类，包含属性name、age。
    2. 使用反射的方式创建一个实例、调用构造函数初始化name、age。使用反射方式调用setName方法对姓名进
    行设置，不使用setAge方法直接使用反射方式对age赋值。
* */
public class Test07 {
  @Test
  public void test(){
    Class<Person> clazz = Person.class;
    try {
      Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
      declaredConstructor.setAccessible(true);//暴力反射
      //调用构造函数初始化name，age
      Person person  = (Person) declaredConstructor.newInstance("马云", 45);
      System.out.println(person);
      //使用反射调用setName方法设置名字
      Method setName = clazz.getDeclaredMethod("setName", String.class);
      setName.setAccessible(true);//暴力反射
      System.out.println("设置前：");
      setName.invoke(person,"马化腾");
      //接使用反射方式对age赋值
      Field age = clazz.getDeclaredField("age");
      age.setAccessible(true);
      age.set(person,42);
      System.out.println("设置后：");
      System.out.println(person);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
