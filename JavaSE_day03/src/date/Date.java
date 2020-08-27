package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
  public static void main(String[] args) {
    /*
    *
    * FORMAT(),把事件转换成知道的格式
    * */
    java.util.Date date = new java.util.Date();
    DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
    String format = df.format(date);
    System.out.println(format);

    //把字符串转换成时间格式
    try {
      java.util.Date parse = df.parse(format);
      System.out.println(parse);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    /*
    *   System类的方法
    * */
    //当前毫秒值
    System.out.println(System.currentTimeMillis());
  }
}
