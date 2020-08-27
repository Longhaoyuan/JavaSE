package Demo;

public class Test01 {
  public static void main(String[] args) {
    /*
    * for循环扩展：
    *   break和continue后加标记  结束或跳出指定循环
    *   格式：
    *     标记：for（；；）{}
    *     break 标记/continue 标记
    *
    * */
    test01:for (int i = 1; i <= 3; i++) {
      test02:for (int j = 1; j <=3; j++) {
        /*System.out.println(12);*/
        if(i%2==0)
          break test01;
        else
          System.out.print(i+"-"+j+" ");
      }
      System.out.println();
    }
  }
}
