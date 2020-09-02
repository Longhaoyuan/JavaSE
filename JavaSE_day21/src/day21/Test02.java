package day21;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*
* 1. 现有集合：ArrayList list = new ArrayList();
2. 利用反射机制在这个泛型为Integer的ArrayList中存放一个String类型的对象。
* */
public class Test02 {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    ArrayList<Integer> list = new ArrayList();
    Collections.addAll(list,1,5,321,5,13,131);
    //获取类
    Class<? extends ArrayList> aClass = list.getClass();
    //获取添加元素的方法
    Method add = aClass.getDeclaredMethod("add", Object.class);
    //添加String类型的元素
    add.invoke(list,"你好吗");
    System.out.println(list);
  }
}
