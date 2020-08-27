package day11.Checkpoint03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
  public static void main(String[] args) throws ParseException {
    String dateStr = "2016-12-18";
    DateFormat df = new SimpleDateFormat("yyyy-MM-ss");
    Date mydate = df.parse(dateStr);
    //修改时间格式
    ((SimpleDateFormat) df).applyPattern("yyyy年MM月dd日");
    System.out.println("您所输入的时间为："+df.format(mydate));
  }
}
