package list;

import java.util.*;

public class Lis {
  public static void main(String[] args) {
    List list = (List) new ArrayList1();
    List list1 = (List) new LinkedList1();
    List list2 = new Vector();

    list.add(79);
    list.add(5);
    list.add(1,54);
    Collections.sort(list);
    System.out.println(list);
    //for方法遍历
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
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
   //面试题一 abcbcbc
    int x=1;
    for(System.out.println("a");x<=3; System.out.println("c")){
      System.out.println("b");
      x++;
    }
    //面试题二：a=1
    int a=1;
    for (int i = 0; i <100 ; i++) {
      a=a++;//a每次赋值，a++，先用后赋值，所以每次a=1，没拿到++后的值
    }
    System.out.println(a);
  }
}
