package stringDemo;

import java.util.Scanner;

public class StringPritect01 {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("请输入字符串：");
    String userStr = sc.next();
    System.out.println(userStr.length());
    int bingCount = 0;
    int smallCount = 0;
    int numCount = 0;
    int otherCount = 0;

    for (int i = 0; i < userStr.length(); i++) {
      if (userStr.charAt(i)>='A'&&userStr.charAt(i)<='Z'){
        bingCount++;
      }else if (userStr.charAt(i)>='a'&&userStr.charAt(i)<='z'){
        smallCount++;
      }else if(userStr.charAt(i)>='0'&&userStr.charAt(i)<='9'){
        numCount++;
      }else
        otherCount++;
    }
    System.out.println("大写字符有："+bingCount);
    System.out.println("小写写字符有："+smallCount);
    System.out.println("数字有："+numCount);
    System.out.println("其他字符有："+otherCount);
  }
}
