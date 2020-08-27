package day11.Checkpoint01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
  public static void main(String[] args) {
    Date now = new Date();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
    System.out.println( df.format(now));
  }
}
