package day13.checkpoint02;

import java.util.LinkedList;
import java.util.List;

/*
* 已知数组存放一批QQ号码.QQ号码最长为11位,最短为5位
* String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
* 将该数组里面的所有qq号都存放在LinkedList中,将list中重复元素删除,将list中所有元素用两种方式打印出来
* */
public class Test03 {
  public static void main(String[] args) {
    String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
    System.out.println("数组中的QQ号有：");
    List<String> list = new LinkedList();
    for (String str : strs) {
      System.out.print(str+" ");
      if (!list.contains(str)){
        list.add(str);
      }
    }
    System.out.println();
    System.out.println("去重后的QQ号：");
    list.stream().forEach(n->{
      System.out.print(n+" ");
    });
    System.out.println();
    System.out.println("去重后的QQ号：");
    for (String s : list) {
      System.out.print(s+" ");
    }
  }
}
