package day13.checkpoint02;

import java.util.*;

/*
 *有2个ArrayList,元素如下: array1 = "a","b","a","c","d",
 * array2= "e","f","a","d","g",将两个集合重复项去除后合并成一 个集合
 * */
public class Test09 {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    Collections.addAll(list1, "a", "b", "a", "c", "d");
    List<String> list2 = new ArrayList<>();
    Collections.addAll(list2, "e", "f", "a", "d", "g");

    Set<String> set = new LinkedHashSet<>();
    set.addAll(list1);
    set.addAll(list2);

    System.out.println("去重合并之后的的数据：");
    System.out.println(set);
  }
}
