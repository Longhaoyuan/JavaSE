package day14.homeworldmap.checkpoint01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 往一个Map集合中添加若干元素.获取Map中的所有key,
 * 并使用增强for和迭代器遍历输出每个key
 * */
public class Test02 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("k1", "杰克逊");
    map.put("k2", "马尔福");
    map.put("k3", "福尔斯");

    Set<String> set = map.keySet();
    for (String s : set) {
      System.out.println(s + "," + map.get(s));
    }
    System.out.println();
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String next = iterator.next();
      System.out.println(next + "," + map.get(next));
    }
  }
}
