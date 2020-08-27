package day14.homeworldmap.checkpoint01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰",
* "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->
* ”张柏 芝”.使用keySet方式迭代出Map集合中的元素
* */
public class Test04 {
  public static void main(String[] args) {
    Map<String,String> map = new HashMap<>();
    map.put("邓超","孙俪");
    map.put("李晨","范冰冰");
    map.put("刘德华","柳岩");
    map.put("黄晓明","Angela Baby");
    map.put("谢霆锋","张柏芝");

    Set<String> set = map.keySet();
    for (String s : set) {
      System.out.println(s+"->"+map.get(s));
    }
  }
}
