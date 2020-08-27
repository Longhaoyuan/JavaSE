package day14.homeworldmap.checkpoint01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 *
 * 往一个Map集合中添加若干元素.获取Map中的所有value,
 * 并使用增强for和迭代器遍历输出每个value
 * */
public class Test03 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("k1", "刘易斯");
    map.put("k2", "捷克儿");
    map.put("k3", "福尔斯");

    Collection<String> values = map.values();
    for (String value : values) {
      System.out.print(value+" ");
    }
    System.out.println();
    System.out.println();
    Iterator<String> iterator = values.iterator();
    while (iterator.hasNext()) {
      String next = iterator.next();
      System.out.print(next+" ");
    }
  }
}
