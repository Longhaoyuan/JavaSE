package stringDemo;

import java.util.Scanner;

public class StringPritect03 {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("请输入字符串：");
    String userStr = sc.next();
    char[] chars = userStr.toCharArray();
    char[] chars1 = new char[chars.length];
    chars1[0]=chars[0];
    for (int i = 1; i < chars.length; i++) {
      for (int j = 0; j <=i-1 ; j++) {
        if (chars[i]!=chars1[j]){
          chars1[i]=chars[i];
        }
      }
    }
    for (int i = 0; i < chars1.length; i++) {
      System.out.print(chars1[i]+",");
    }
  }
}
