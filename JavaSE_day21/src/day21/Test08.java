package day21;

import org.junit.Test;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* (1)写一个Properties格式的配置文件，配置类的完整名称。
  (2)写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
  (3)用反射的方式运行run方法。
* */
public class Test08 {
  @Test
  public void getClassAndUseRun(){
    try {
      Properties p = new Properties();
      p.load(new FileReader("./src/day21/classdemo.properties"));//加载配置文件
      Class<?> aClass = Class.forName(p.getProperty("class"));//获取类
      Method run = aClass.getDeclaredMethod("run");//反射run方法
      Object o = aClass.newInstance();
      run.setAccessible(true);//暴力反射
      run.invoke(o);//执行方法
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
