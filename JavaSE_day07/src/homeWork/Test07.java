package homeWork;

import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    System.out.println("请输入一个QQ号码:");
    Scanner sc = new Scanner(System.in);
    String qqNum = sc.next();
    checkQQ(qqNum);
  }

  public static void checkQQ(String qq) {
    char[] chars = qq.toCharArray();
    boolean flag = false;
    if (chars.length >= 5 && chars.length <= 12 && chars[0] != '0') {
      flag = true;
      for (int i = 1; i < chars.length; i++) {
        if (chars[i] >= '0' && chars[i] <= '9')
          flag = true;
        else
          flag = false;
      }
    }
    System.out.println("这个QQ号码是否正确:" + flag);
  }
}
