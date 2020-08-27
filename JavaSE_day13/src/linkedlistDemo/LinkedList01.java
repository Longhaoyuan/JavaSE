package linkedlistDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("45sda");
    list.add("sdga");
    list.add("gdfgd");
    list.add("kkk");

    for (String s : list) {
      System.out.println(s);
    }

  }
}
