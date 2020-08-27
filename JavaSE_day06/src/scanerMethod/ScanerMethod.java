package scanerMethod;

import java.util.Scanner;

/*
* Scaner
*   成员方法：
*     String next（）方法：空格 回车 tab都视作为结束符
*     int nextInt（）方法：只能输出Int类型的数字
*     String nextLine（）：是能是回车才视作结束符
* */
public class ScanerMethod {
  public static void main(String[] args) {
    /*System.out.println("请输入你的名字：");
    Scanner scanner = new Scanner(System.in);
    System.out.println("你的名字是："+scanner.next());*/
    System.out.println("请输入三个数：");
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    int num1 = scanner1.nextInt(),num2 = scanner2.nextInt(),num3 = scanner3.nextInt();
    int max = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
    System.out.println("三个数分别是："+num1+" "+num2+" "+num3+"\n这三个数的最大值是："+max);
  }
}
