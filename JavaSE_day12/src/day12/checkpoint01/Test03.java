package day12.checkpoint01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test03 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList();

    list.add("abc1");
    list.add("abc2");
    list.add("abc3");
    list.add("abc4");
//    list.stream().forEach(System.out::print);
    //获取迭代器
    Iterator<String> iterator = list.iterator();
    //迭代器的hasNext（）是否还有元素   next获取下一个元素
    while (iterator.hasNext()){
      System.out.print(iterator.next()+" ");
    }
  }
}
