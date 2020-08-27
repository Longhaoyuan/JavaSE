package homeWork;

import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    String msg = "奥巴马";
    System.out.println("请输入一个字符串：");
    Scanner sc =new Scanner(System.in);
    String str = sc.next();
    System.out.println(str.replace(msg,"*"));
  }
}
