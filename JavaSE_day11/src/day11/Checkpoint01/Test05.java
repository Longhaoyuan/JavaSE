package day11.Checkpoint01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test05 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println("当前时间为："+df.format(calendar.getTime()));
    calendar.add(Calendar.DATE, 500);
    System.out.println("500天后的时间为："+df.format(calendar.getTime()));
  }
}
