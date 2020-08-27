package arrDemo;


/*
* 基本数据类型的默认值
*   byte short int long  ：0
*   float double         ：0.0
*   char                 ：/u0000  空字符
*   boolean              ：false
*
* 引用类型
*   String               ：null
*
* 常见的错误：
*   java.lang.ArrayIndexOutOfBoundsException: 2   ：索引越界异常
*   空指针异常
* */
public class Array02 {
  public static void main(String[] args) {
    int[] arr = new int[2];
    arr=null;
    System.out.println(arr);
  }
}
