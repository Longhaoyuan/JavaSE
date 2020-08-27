package day13.checkpoint01;

import java.util.LinkedList;
import java.util.List;

public class Test03 {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("忽必烈");
    list.add("铁木真");
    list.add("成吉思汗");
    list.add("努尔哈赤");
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    list.set(1,"汉格尔");
    System.out.println();
    for (String s : list) {
      System.out.print(s+" ");
    }
    System.out.println();
    list.remove(1);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }
    System.out.println("");
    System.out.println("list的大小"+list.size());
    System.out.println("清空集合：");
    list.clear();
    list.stream().forEach(s -> {
      System.out.println(s);
    });
  }
}
