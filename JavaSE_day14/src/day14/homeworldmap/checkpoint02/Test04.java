package day14.homeworldmap.checkpoint02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
* 如用户输入字符串:"helloworld java",程序输出结果：
* h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
* 注：输出结果不要求顺序一致
* */
public class Test04 {
  public static void main(String[] args) {
    System.out.println("请输入字符串：");
    Scanner s = new Scanner(System.in);
    String str = s.next();
    Map<Character, Integer> map = findChar(str);
//    System.out.println(map);
    String countStr = "";
    for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
      countStr+=characterIntegerEntry.getKey()+"("+characterIntegerEntry.getValue()+")";
    }
    System.out.println(countStr);
  }
  public static Map<Character,Integer> findChar(String str){
    Map<Character,Integer> map = new HashMap<>();
    char c = ' ';
    for (int i = 0; i < str.length(); i++) {
      c=str.charAt(i);
      if (!map.containsKey(c)){
        map.put(c,1);
      }else {
        Integer integer = map.get(c);
        integer++;
        map.put(c,integer);
      }
    }
    return map;
  }
}
