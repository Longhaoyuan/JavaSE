package day14.homeworldmap.checkpoint02;

import java.util.HashMap;
import java.util.Map;

/*
* 创建一个Map集合，key存储书名，value存储书的价格. 录入以下5本书数据:
* {Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2}
* 要求：
*   1. 删除集合中的C++这本书
*   2. Java的这本书涨价为38.5元
*   3. 使用keySet和entrySet两种不同方式对集合遍历输出
* */
public class Test09 {
  public static void main(String[] args) {
    Map<String,Double> bookMap = new HashMap<>();
    bookMap.put("Java",32.5);
    bookMap.put("C++",25D);
    bookMap.put("PHP",28.6);
    bookMap.put("UI",21.3);
    bookMap.put("Python",10.2);

    //没涨价之前
    System.out.println("每本书的价格：");
    for (String s : bookMap.keySet()) {
      System.out.println(s+":"+bookMap.get(s)+"元");
    }
    //Java涨价
    bookMap.put("Java",38.5);
    System.out.println("涨价后：");
    for (Map.Entry<String, Double> stringDoubleEntry : bookMap.entrySet()) {
      System.out.println(stringDoubleEntry.getKey()+":"+stringDoubleEntry.getValue()+"元");
    }
  }
}
