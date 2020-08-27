package day13.checkpoint01;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* 使用LinkedHashSet存储以下元素:"王昭君","王昭君","西施","杨玉环","貂蝉".
* 使用迭代器和增强for循环遍历 LinkedHashSet
* */
public class Test08 {
  public static void main(String[] args) {
    Set<String> stringSet = new LinkedHashSet<>();

    Collections.addAll(stringSet,"王昭君","王昭君","西施","杨玉环","貂蝉");
    Iterator<String> iterator = stringSet.iterator();
    while (iterator.hasNext()){
      System.out.print(iterator.next()+" ");
    }
    System.out.println();
    for (String s : stringSet) {
      System.out.print(s+" ");
    }
  }
}
