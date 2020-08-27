package day13.checkpoint02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 使用迭代器把最终的结果输出到控制台。
 * */
public class Test06 {
  public static void main(String[] args) {
    Set<Integer> integers = new HashSet<>();
    Random random = new Random();
    Integer i;
    while (integers.size() < 10) {
      i = random.nextInt(20) + 1;
      integers.add(i);
    }
    Iterator<Integer> iterator = integers.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}
