package day11.Checkpoint02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) throws ParseException {
    System.out.println("请输入你的生日：");
    String date = new Scanner(System.in).next();
//    String date = "1998-06-08";
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Date born = df.parse(date);
    long bornTime = born.getTime();
    long now = new Date().getTime();
    System.out.println("您已经活了"+(now-bornTime)/1000/60/60/24+"天了");
  }
}
