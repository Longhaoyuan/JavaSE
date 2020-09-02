package classdemo;

import classdemo.entities.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;

/*
* 获取属性
* */
public class GetFiled {
  static Class clazz;
  @BeforeClass
  public static void before(){
    clazz = Student.class;
  }

  @Test
  public void getGeneralFields(){
    //获取所有public修饰的属性
    Field[] fields = clazz.getFields();
    for (Field field : fields) {
      System.out.println(field);
    }
  }
  @Test
  public void getAllFields(){
    //获取包含非public修饰的属性
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field);
    }
  }
  @Test
  public void getPublicField() throws Exception{
    //获取指定的public修饰的属性
    Object o = clazz.newInstance();
    Field field = clazz.getField("hobby");
    field.set(o,"看小说");
    System.out.println(o);
  }
  @Test
  public void getSpcialField() throws Exception{
    //获取指定的非public（private等）修饰的属性
    Object o = clazz.newInstance();
    Field field = clazz.getDeclaredField("name");
    //必须暴力反射
    field.setAccessible(true);
    field.set(o,"马云");
    System.out.println(o);
  }
}
