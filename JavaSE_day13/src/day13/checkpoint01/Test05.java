package day13.checkpoint01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
*
* 往HashSet中添加字符串"zhangsan", "lisi","wangwu", "zhangsan".使用迭代器获取HashSet中的元素.
* */
public class Test05 {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    Collections.addAll(set,"zhangsan","lisi","wangwu","zhangsan");
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
