package list;

import java.util.Iterator;
import java.util.List;

public class LinkedList1 {
  public static void main(String[] args) {
    List linkedList = new java.util.LinkedList();
    ((java.util.LinkedList) linkedList).push("Edson");
    ((java.util.LinkedList) linkedList).push("Mocao");
    linkedList.add("Change");
    System.out.println(linkedList);
    ((java.util.LinkedList) linkedList).pop();
    Iterator iterator = linkedList.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
