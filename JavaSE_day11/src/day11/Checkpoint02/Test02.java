package day11.Checkpoint02;

import java.util.Date;

public class Test02 {
  public static void main(String[] args) {
    //String拼接字符串所需的时间
    String str1 = new String();
    Date startStringTime = new Date();
    for (int i = 0; i < 10000; i++) {
      str1+= "测试测试测试测试测试测试测试测试测试测试测试测试";
    }
    Date endStringTime = new Date();
    //StringBulider拼接字符串所需的时间
    System.out.println("String拼接字符串所需的时间"+(endStringTime.getTime()-startStringTime.getTime())+"毫秒");
    StringBuilder str2 = new StringBuilder("");
    Date startStringBuilderTime = new Date();
    for (int i = 0; i < 10000; i++) {
      str2.append("测试测试测试测试测试测试测试测试测试测试测试测试");
    }
    Date endStringBuilderTime = new Date();
    System.out.println("StringBulider拼接字符串所需的时间"+(endStringBuilderTime.getTime()-startStringBuilderTime.getTime())+"毫秒");
  }
}
