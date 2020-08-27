package testdemo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream01 {
  public static void main(String[] args){
    // 使用stream流实现
    test02();
  }

  // 使用传统方法实现
  public static void test02(){
    List<String> list = new ArrayList<>();
    list.add("张无忌");
    list.add("周芷若");
    list.add("赵敏");
    list.add("张强");
    list.add("张三丰");

    //list转换成stream
    Stream<String> stream = list.stream()
      .filter(s -> {
        System.out.println("过滤姓张的");
        return s.startsWith("张");
      })
      .filter(s -> {
        System.out.println("过滤三个字的");
        return s.length() == 3;
      });
    //stream转换成list
    List<String> list2 = stream.collect(Collectors.toList());
    list2.stream().forEach(System.out::println);

    //简写的方式
    list.stream().filter(n -> {
      return n.startsWith("张") && n.length() == 3;
    }).forEach(System.out::println);

  }
}
