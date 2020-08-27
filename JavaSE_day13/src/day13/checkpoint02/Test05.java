package day13.checkpoint02;

import java.util.*;

/*
* 有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};创建一个ArrayList，
* 将数组里面的元素添加进 ArrayList，但元素不能重复(使用HashSet去除重复元素)
* */
public class Test05 {
  public static void main(String[] args) {
    String[] arr={"abc","bad","abc","aab","bad","cef","jhi"};
    Set<String> set = new HashSet<>();
    List<String> list = new ArrayList<>();
    System.out.println("排序前：");
    for (String s : arr) {
      System.out.print(s+" ");
//      set.add(s);
    }
    set.addAll(Arrays.asList(arr));
    list.addAll(set);
    System.out.println();
    System.out.println("排序后");
    for (String s : list) {
      System.out.print(s+" ");
    }
  }
}
