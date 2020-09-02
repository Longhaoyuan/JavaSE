package classdemo;

import classdemo.entities.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Method;

public class GetGeneralMethod {
  static Class<Student> studentClass;
  @BeforeClass
  public static void before() throws ClassNotFoundException {
    studentClass = (Class<Student>) Class.forName("classdemo.entities.Student");
  }
  @Test
  public void getAllMethods() throws NoSuchMethodException {
    //获取所有的方法，包括私有的方法
    Method[]  methods= studentClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
  }
  @Test
  public void getAllPublicMethods() throws NoSuchMethodException {
    //获取所有公开的方法
    Method[]  methods= studentClass.getMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
  }
  @Test
  public void getPublicMethod() throws Exception {
    //构造元素
    //无参构造
    Student student = studentClass.newInstance();
    //获取指定的public方法
    Method eat = studentClass.getMethod("eat");
    System.out.println(eat);
    /*
     * 根据参数args调用对象obj的该成员方法
     * 如果obj=null，则表示该方法是静态方法
     * */
    Object invoke = eat.invoke(student);
    System.out.println(invoke);
  }
  @Test
  public void getPublicMethod2() throws Exception {
    //构造元素
    //无参构造
    Student student = studentClass.newInstance();
    //获取指定的public方法
    Method eat = studentClass.getMethod("sleep",int.class);
    /*
     * 根据参数args调用对象obj的该成员方法
     * 如果obj=null，则表示该方法是静态方法
     * */
    Object invoke = eat.invoke(student,20);
    System.out.println(invoke);
  }

  @Test
  public void getPrivateMethod() throws Exception {
    //构造元素
    //无参构造
    Student student = studentClass.newInstance();
    //获取指定的非public方法
    Method eat = studentClass.getDeclaredMethod("show");
    /*
     * 根据参数args调用对象obj的该成员方法
     * 如果obj=null，则表示该方法是静态方法
     * */
    //非public方法需要暴力反射
    eat.setAccessible(true);
    Object invoke = eat.invoke(student);
    System.out.println(invoke);
  }
  @Test
  public void getStaticPublicMethod() throws Exception {
    //构造元素
    //无参构造
    Student student = studentClass.newInstance();
    //获取指定的非public方法
    Method eat = studentClass.getMethod("study");
    /*
     * 根据参数args调用对象obj的该成员方法
     * 如果obj=null，则表示该方法是静态方法
     * */
    Object invoke = eat.invoke(null);
    System.out.println(invoke);
  }
  @Test
  public void getStaticPrivateMethod() throws Exception {
    //构造元素
    //无参构造
    Student student = studentClass.newInstance();
    //获取指定的非public方法
    Method eat = studentClass.getDeclaredMethod("studyX");
    /*
     * 根据参数args调用对象obj的该成员方法
     * 如果obj=null，则表示该方法是静态方法
     * */
    //非public方法需要暴力反射
    eat.setAccessible(true);
    Object invoke = eat.invoke(null);
    System.out.println(invoke);
  }
}
