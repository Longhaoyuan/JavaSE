package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*
*   List集合之ArrayList，以数组形式的集合
*     具有数组的特性，有索引
* */
public class ArrayList1 {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(79);
    list.add(5);
    list.add(1, 54);
    Collections.sort(list);
    System.out.println(list);
    //for方法遍历
   /* for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }*/
    ListIterator listIterator = list.listIterator();
    while (listIterator.hasNext()){
      System.out.println(listIterator.nextIndex()+" "+listIterator.next());
    }
   /* //for-each方法遍历
    for (Object o : list) {
      System.out.println(o);
    }
    //Iterator集合通用类的遍历方法
    Iterator iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }*/
  }
}
