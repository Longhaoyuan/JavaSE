package day11.Checkpoint01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test04 {
  public static void main(String[] args) throws ParseException {
    System.out.println("请输入的你生日：");
    /*Scanner sc = new Scanner(System.in);
    String date = sc.next();*/
    String date = "1998-04-25";
    System.out.println(date);
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println("您的出生年月日为:" + df.parse(date));
  }
}
