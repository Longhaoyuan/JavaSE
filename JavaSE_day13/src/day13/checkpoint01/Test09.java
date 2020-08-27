package day13.checkpoint01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* ArrayList集合中有如下内容: {33,11,77,55}
  * 1. 使用Collections.sort()对ArrayList集合中的数据进行排序,并打印出排序后的结果。
  * 2. 使用Collections.shuffle ()对ArrayList集合中的数据进行随机打乱顺序,并打印出排序后的结果。
  * 3. 使用Collections.reverse()对ArrayList集合中的数据进行反转,使用增强for遍历ArrayList集合。
* */
public class Test09 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Collections.addAll(list,33,11,77,55);
    System.out.println();
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    Collections.sort(list);
    System.out.println();
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    Collections.shuffle(list);
    System.out.println();
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    Collections.reverse(list);
    System.out.println();
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
  }
}
