package day14.homeworldmap.checkpoint02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 键盘录入一个字符串,分别统计出其中英文字母、空格、
* 数字和其它字符的数量,输出结果:”其他=1, 空格=2, 字母 =12, 数字=6”
* */
public class Test05 {
  public static void main(String[] args) {
    System.out.println("请输入信息：");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    Map<String, Integer> map = checkStr(str);
    System.out.println(map);
  }
  public static Map<String,Integer> checkStr(String str){
    Map<String,Integer> map = new HashMap<>();
    Integer countNum = 0;
    Integer countEnmpt = 0;
    Integer countLetter = 0;
    Integer countOther = 0;
    char[] chars = str.toCharArray();
    for (char aChar : chars) {
      if (Character.isDigit(aChar)){
        countNum++;
      }else if (Character.isUpperCase(aChar)||Character.isLowerCase(aChar)){
        countLetter++;
      }else if (Character.isSpace(aChar)){
        countEnmpt++;
      }else
        countOther++;
    }
    map.put("其他",countOther);
    map.put("数字",countNum);
    map.put("字母",countLetter);
    map.put("空格",countEnmpt);
    return map;
  }
}
