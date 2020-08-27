package day14.homeworldmap.checkpoint02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 使用键盘录入5个学生信息,录入格式为:”姓名,年龄”.
* 将这5个学生信息存入Map集合中,key是姓名,value是年龄
* */
public class Test01 {
  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    String name;
    Integer age;
    int count = 1;
    while (map.size()<5){
      System.out.println("请输入第"+count+"位学生姓名：");
      name = scanner.next();
      System.out.println("请输入第"+count+"位学生年龄：");
      count++;
      age=scanner.nextInt();
      map.put(name,age);
    }
    System.out.println("学生信息：");
    for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
      System.out.println("姓名："+stringIntegerEntry.getKey()+",年龄："+stringIntegerEntry.getValue());
    }
  }
}
