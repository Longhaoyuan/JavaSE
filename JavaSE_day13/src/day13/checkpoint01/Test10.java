package day13.checkpoint01;

import java.util.ArrayList;
import java.util.List;

/*
* 定义一个方法add接收0个及以上的String类型数据,这个方法的作用是将传入
* 的String类型的参数放入一个ArrayList 中,并返回这个ArrayList集合
* */
public class Test10 {
  public static void main(String[] args) {
    List<String> stringList = add("王昭君", "王昭君", "西施", "杨玉环", "貂蝉");
    for (String s : stringList) {
      System.out.print(s + " ");
    }
  }
  public static List<String> add(String... str){
    List<String> list = new ArrayList<String>();
    for (String s : str) {
      list.add(s);
    }
    return list;
  }
}
