package day14.homeworldmap.checkpoint02;

import java.util.*;

/*
* 定义一个List集合,泛型为String类型。统计整个集合中所有字符（注意，不是字符串）的个数。
* 例如:集合中 有”abc”、”bcd”两个元素,程序最终输出结果为:“a = 1,b = 2,c = 2,d = 1”
* */
public class Test06 {
  public static void main(String[] args) {
    List<String> list = new ArrayList();
    Collections.addAll(list,"abcsss","afaffff","rrrsfaf");
    Map<Character, Integer> map = countStrInList(list);
    System.out.println(map);
  }
  public static Map<Character,Integer> countStrInList(List<String> list){
    Map<Character,Integer> map = new HashMap<>();
    for (String s : list) {
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!map.containsKey(c)){
          map.put(c,1);
        }else{
          Integer integer = map.get(c)+1;
          map.put(c,integer);
        }
      }
    }
    return map;
  }
}
