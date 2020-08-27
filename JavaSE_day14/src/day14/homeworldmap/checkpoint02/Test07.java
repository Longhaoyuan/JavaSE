package day14.homeworldmap.checkpoint02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 键盘录入语句英语,统计每个单词出现的次数。
*   1. 录入格式如：If you wantto change your fate I think you must come to the dark horse to learnjava (用空 格间隔)
* */
public class Test07 {
  public static void main(String[] args) {
//    String str = "If you want to change your fate I think you must come to the dark horse to learn java";
    System.out.println("请输入英文语句：");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    Map<String, Integer> map = countWord(str);
    map.forEach((k,v)->{
      System.out.println(k+"="+v);
    });
  }
  public static Map<String,Integer> countWord(String str){
    Map<String,Integer> map = new HashMap<>();
    String[] strs = str.split(" ");
    for (String s : strs) {
      if (!map.containsKey(s)){
        map.put(s,1);
      }else{
        Integer integer = map.get(s)+1;
        map.put(s,integer);
      }
    }
    return map;
  }
}
