package day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * 从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
 * */
public class Test09 {
  public static void main(String[] args) {
    System.out.println("请输入一个您需要输入的信息：");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    PrintStream printStream = null;

    try {
      printStream = new PrintStream("d.txt");
      printStream.println("您输入的信息是：" + str);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (printStream!=null){
        printStream.close();
      }
    }
  }
}
