package day21;

import day21.entities.Student;
import org.junit.Test;

import java.lang.reflect.Field;

public class Test06 {
  @Test
  public void test(){
    Student student = new Student("马化腾","女",42);
    System.out.println("修改前的性别："+student.getSex());
    setProperty(student,"sex","男");
    Object sex = getProperty(student, "sex");
    System.out.println("修改前的性别："+sex);
  }
  /*按要求完成下面两个方法的方法体
  写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.*/
  public void setProperty(Object obj,String propertyName,Object value){

    Class<?> clazz = obj.getClass();
    try {
      Field field = clazz.getDeclaredField(propertyName);
      field.setAccessible(true);//暴力反射，不知道所修改的属性是不是public修饰的
      field.set(obj,value);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  /*写一个方法，此方法可以获取obj对象中名为propertyName的属性的值*/
  public Object getProperty(Object obj,String propertyName){
    Class<?> clazz = obj.getClass();
    Object o =null;
    try {
      Field declaredField = clazz.getDeclaredField(propertyName);
      declaredField.setAccessible(true);//暴力反射
      o=declaredField.get(obj);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return o;
  }
}
