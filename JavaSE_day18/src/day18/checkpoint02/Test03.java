package day18.checkpoint02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 * 在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成) 定义一个方法统计
 * test.txt文件中指定字符出现的次数。比如a字符在文件中出现了10次则调用
 * 方法传入a后，方法内部输出：a出现10次
 * */
public class Test03 {
  public static void main(String[] args){
    File file = new File("test.txt");
    printTestChar(file);
  }

  public static void printTestChar(File file) {
    Map<Character, Integer> map = new HashMap<>();
    int num;
    FileInputStream fis = null;
    try {
      fis = new FileInputStream(file);
      while ((num = fis.read()) != -1) {
        char s = (char) num;
        if (map.get(s) == null) {
          map.put(s, 1);
        } else {
          map.put(s, map.get(s) + 1);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //关闭流
      try {
        if (fis!=null){
          fis.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    map.forEach((k, v) -> {
      System.out.println(k + "出现" + v + "次");
    });
  }
}
