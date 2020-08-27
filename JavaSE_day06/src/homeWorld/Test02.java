package homeWorld;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    System.out.println("请输入第一个数据：");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    System.out.println("请输入第二个数据：");
    Scanner scanner1 = new Scanner(System.in);
    int b = scanner.nextInt();

    System.out.println("请输入第三个数据：");
    Scanner scanner2 = new Scanner(System.in);
    int c = scanner.nextInt();


    int temp = a>b?a:b;
    int max = temp>c?temp:c;
    System.out.println("三个数的最大值："+max);
  }
}
