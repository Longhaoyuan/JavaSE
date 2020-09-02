package classdemo.Demo;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Test01 {
  public static void main(String[] args) throws Exception {
    Object obj = createObj();
    System.out.println(obj);
  }
  //反射类的综合实践
  public static Object createObj() throws Exception {
    Properties properties = new Properties();
    properties.load(new FileReader("stu.properties"));
    Set<String> set = properties.stringPropertyNames();
    Class clazz = Class.forName(properties.getProperty("class"));//获取类
    Object o = clazz.newInstance();//创建对象
    for (String s : set)
      if (!"class".equals(s)) {
        Field declaredField = clazz.getDeclaredField(s);
        Class<?> type = declaredField.getType();//获取属性类型
        declaredField.setAccessible(true);//暴力反射
        if (type == Double.class) {
          System.out.println("4564");
          declaredField.set(o, Double.valueOf(properties.getProperty(s)));
        }else if(type == Integer.class){
          declaredField.set(o, Integer.valueOf(properties.getProperty(s)));
        }
        else
          declaredField.set(o, properties.getProperty(s));//设置属性
      }
    return o;
  }
}
