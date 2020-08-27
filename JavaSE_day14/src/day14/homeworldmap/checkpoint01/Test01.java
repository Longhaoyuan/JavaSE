package day14.homeworldmap.checkpoint01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * 练习Map集合的常用方法: put, get, remove
 * */
public class Test01 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("key1", "Hello");
    map.put("key2", "my");
    map.put("key3", "girl");
    for (String s : map.keySet()) {
      System.out.println(s + "," + map.get(s));
    }
    System.out.println();
    map.put("key3", "bother");
    //容量大的时候使用
    for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
      System.out.println(stringStringEntry.getKey()+","+stringStringEntry.getValue());
    }

    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
   /* while (iterator.hasNext()) {
      Map.Entry<String, String> next = iterator.next();
      System.out.println(next.getKey() + "," + next.getValue());
    }*/
    //1.8新特性
    System.out.println();
    map.remove("key2");
    map.forEach((k, v) -> {
      System.out.println(k + "," + v);
    });
  }
}
