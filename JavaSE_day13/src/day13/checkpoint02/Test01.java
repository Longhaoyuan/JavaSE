package day13.checkpoint02;

import java.util.*;

/*
* ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合
* 去重(最终结果: ArrayList中没有重复元素)
* */
public class Test01 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Collections.addAll(list,"a","f","b","c","a","d");
    for (String s : list) {
      System.out.print(s+" ");
    }
    //set去重
    Set<String> set = new HashSet<>();
    set.addAll(list);
    System.out.println();
    for (String s : set) {
      System.out.print(s+" ");
    }
    //把去重后的添加回数组
    list.clear();
    list.addAll(set);
    System.out.println();
    for (String s : set) {
      System.out.print(s+" ");
    }
  }
}
