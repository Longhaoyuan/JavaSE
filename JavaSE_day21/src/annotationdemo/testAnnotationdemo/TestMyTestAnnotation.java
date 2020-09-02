package annotationdemo.testAnnotationdemo;

public class TestMyTestAnnotation {
  @MyTest
  public void test1(){
    System.out.println("test01的开始啦");
  }
  @MyTest
  public void test2(){
    System.out.println("test02的开始啦");
  }
  @MyTest
  public void test3(){
    System.out.println("test03的开始啦");
  }

  public void test4(){
    System.out.println("test04的开始啦");
  }
}
