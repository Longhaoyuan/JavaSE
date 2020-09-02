package classdemo;

/*
 * Class对象的方法
 * */
public class ClassMethod {
  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Class<?> aClass = Class.forName("java.lang.String");
    //获取简单类名
    String simpleName = aClass.getSimpleName();
    System.out.println(simpleName);
    //获取完整类名
    String name = aClass.getName();
    System.out.println(name);
    //创建字符串对象
    String str = (String) aClass.newInstance();
    System.out.println(str);
  }
}
