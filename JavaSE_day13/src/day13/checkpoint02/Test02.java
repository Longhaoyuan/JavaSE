package day13.checkpoint02;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* 向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,钱六},将二丫删除,添加王小丫
* */
public class Test02 {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    Collections.addAll(set,"张三","李四","王五","二丫","钱六","钱六");
    set.stream().forEach(n->{
      System.out.print(n+" ");
    });
    set.remove("二丫");
    System.out.println();
    set.stream().forEach(n->{
      System.out.print(n+" ");
    });
    set.add("王小丫");
    System.out.println();
    set.stream().forEach(n->{
      System.out.print(n+" ");
    });
  }
}
