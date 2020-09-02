package junitDemo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args){
    ArrayList list  = new ArrayList();
    System.out.println("集合创建后的容量：");
    getLength(list);
    list.add(1);
    //添加数组后进行第一次扩容
    System.out.println("第一次扩容后的list集合容量：");
    getLength(list);
    Collections.addAll(list,2,3,4,5,6,7,8,9,10,11);
    System.out.println("验证第二次扩容后的容量(10*1.5)");
    getLength(list);
    Collections.addAll(list,12,13,14,15,16);
    System.out.println("验证第三次扩容后的容量(15*1.5)");
    getLength(list);
  }
  public static void getLength(List list){
    Class aClass = list.getClass();//获取ArrayList的Class对象
    try {
      Field elementData = aClass.getDeclaredField("elementData");//反射获取存放数据的Object数组属性
      elementData.setAccessible(true);//暴力反射
      Object[] o = (Object[]) elementData.get(list);//获取数组
      System.out.println("集合的容量为："+o.length);//获取数组长度
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
