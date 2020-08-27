package day13.checkpoint01;

import java.util.LinkedList;
import java.util.List;

public class Test04 {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("忽必烈");
    list.add("铁木真");
    list.add("成吉思汗");
    list.add("努尔哈赤");
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    System.out.println();
    System.out.println("LinkedList特有addFirst方法后:");
    ((LinkedList<String>) list).addFirst("玛珥湖");
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    System.out.println();
    System.out.println("LinkedList特有addLast方法后:");
    ((LinkedList<String>) list).addLast("李渊");
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    System.out.println();
    System.out.println("LinkedList特有getFirst方法:"+((LinkedList<String>) list).getFirst());
    System.out.println("LinkedList特有getLast方法:"+((LinkedList<String>) list).getLast());
    System.out.println("LinkedList特有removeLast方法后:");
    ((LinkedList<String>) list).removeLast();
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    System.out.println();
    System.out.println("LinkedList特有removeFirst方法后:");
    ((LinkedList<String>) list).removeFirst();
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
  }
}
