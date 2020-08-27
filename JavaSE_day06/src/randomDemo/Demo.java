package randomDemo;

import java.util.Random;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    int num = new Random().nextInt(100);

    while (true){
      System.out.println("请输入你要猜得数字：");
      int guessNum = new Scanner(System.in).nextInt();
      if (guessNum>num){
        System.out.println("Sorr，你猜大了！");
      }else if (guessNum<num){
        System.out.println("Sorr，你猜小了！");
      }
      else
        break;
    }
  }
}
