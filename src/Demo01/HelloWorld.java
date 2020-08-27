package Demo01;

import Animal.Cat;

import java.util.LinkedList;

public class HelloWorld {
  void LinkList() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    for (Integer i : list) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    HelloWorld h = new HelloWorld();
    h.LinkList();
    Cat cat = new Cat();
    System.out.println(cat);
  }
}
