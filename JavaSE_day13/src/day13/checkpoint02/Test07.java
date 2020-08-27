package day13.checkpoint02;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
* 键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.
* 必须保证顺序.例如输入:aaaabbbcccddd,打印结果 为：abcd
* */
public class Test07 {
  public static void main(String[] args) {
    Set set = new LinkedHashSet<>();
    System.out.println("请输入一个字符串");
    String str = new Scanner(System.in).next();

    char[] chars = str.toCharArray();
    for (char aChar : chars) {
      set.add(aChar);
    }
    System.out.println("去重后的数据为：");
    set.stream().forEach(System.out::print);
  }
}
