package day18.checkpoint01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输 入：”886”时，程序结束。
 * */
public class Test08 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("Test.txt", true);
    System.out.println("请输入你所需要存储的信息");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    while (true) {
      if ("886".equals(str)) {
        System.out.println("存储完成");
        break;
      } else {
        fos.write(str.getBytes());
        System.out.println("请输入你所需要存储的信息");
        str = scanner.nextLine();
      }
    }
  }
}
