package junitDemo;

import org.junit.*;

public class JunitDemo {
  //每个@Test方法前和方法后都会执行一次
  @Before
  public void fun1(){
    System.out.println("方法前执行");
  }
  @After
  public void after(){
    System.out.println("方法后执行");
  }
  @Test
  public void fun(){
    System.out.println("hello，junit");
  }
  //必须是静态的
  @BeforeClass
  public static void beforeClass(){
    System.out.println("类加载时只执行一次");
  }
  @AfterClass
  public static void afterClass(){
    System.out.println("类结束时只执行一次");
  }
  @Test
  public void fun2(){
    System.out.println("你就是啥子");
  }
}
