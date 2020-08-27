package day14.homeworldmap.checkpoint03;

import java.util.HashMap;
import java.util.Map;

/*
* 小米科技包含2个班级：Java基础班，Java就业班
Java基础班
 001 李晨
 002 范冰冰
Java就业班
 001 马云
 002 马化腾
使用HashMap集合存储以上班级的学生信息，并完成以下两个需求
1. 使用keySet和增强for遍历出里面的元素
2. 使用entrySet和迭代器遍历出里面的元素
* */
public class Test01 {
  public static void main(String[] args) {
    Map<String,Map<String,String>> classMap = new HashMap<>();
    Map<String,String> stuMap = new HashMap<>();
    Map<String,String> stuMapTow = new HashMap<>();
    stuMap.put("001","李晨");
    stuMap.put("002","范冰冰");
    stuMapTow.put("001","马云");
    stuMapTow.put("002","马化腾");

    classMap.put("Java基础班",stuMap);
    classMap.put("Java就业班",stuMapTow);

    classMap.forEach((k,v)->{
      System.out.println(k+"有：");
      v.forEach((k1,v1)->{
        System.out.println("学号："+k1+",姓名："+v1);
      });
    });
  }
}
