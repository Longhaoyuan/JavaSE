package annotationdemo;

import java.lang.reflect.Method;

public class Test {
  @org.junit.Test
  public  void getAnnotation(){
    //解析获取类上面的注解
    Class<BookAnnotation> testClass = BookAnnotation.class;//获取类对象
    Book b = testClass.getAnnotation(Book.class);//获取类上面的注解
    String name = b.name();
    int age = b.age();
    String sex = b.sex();
    System.out.println(name);
    System.out.println(age);
    System.out.println(sex);
  }
  @org.junit.Test
  public  void getMethodAnnotation() throws NoSuchMethodException {
    //解析获取方法上面的注解
    Class<BookAnnotation> testClass = BookAnnotation.class;//获取类对象
    Method show = testClass.getDeclaredMethod("show");//获取指定方法
    Book b = show.getAnnotation(Book.class);//获取方法上面的注解
    String name = b.name();
    int age = b.age();
    String sex = b.sex();
    System.out.println(name);
    System.out.println(age);
    System.out.println(sex);
  }
}
