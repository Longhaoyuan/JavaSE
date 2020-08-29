package day19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现 实现一个验证码小程序，要求如下：
 *    1. 在项目根目录下新建一个文件：data.txt，键盘录入3个字符串验证码，
 * 并存入data.txt中，要求一个验证码占 一行；
 *    2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：
 * 在控制台提示验证成功，如果不存 在控制台提示验证失败
 * */
public class Test04 {
  public static void main(String[] args) {
    System.out.println("请输入需要存储的验证码：");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    BufferedWriter bw = null;
    BufferedReader br = null;
    List<String> list = new ArrayList<>();
    try {
      bw = new BufferedWriter(new FileWriter("data.txt",true));
      br = new BufferedReader(new FileReader("data.txt"));
      bw.write(str+"\r\n");
      bw.flush();
      String checkCode = null;
      while ((checkCode = br.readLine()) != null) {
        list.add(checkCode);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (bw != null) {
          bw.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println("请输入需要您的验证码：");
    String code = scanner.next();
    while (true){
      if (list.contains(code)){
        System.out.println("验证码正确！");
        break;
      }else {
        System.out.println("密码错误，请重新输入验证码");
        code = scanner.next();
      }
    }
  }
}
