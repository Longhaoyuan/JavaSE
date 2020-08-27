package stringDemo;
/*
*   成员方法：
*     equals(Object obj);将此字符串与指定的字符串的值对比
*     equalsIgnoreCase(Object obj) 忽略大小写
* 建议写法： 常量.成员方法(变量)
* */
public class StringDemo02 {
  public static void main(String[] args) {
    String str1 = "admin";
//    String str1 = null;
    String str2 = "admiN";
    String str3 = "admi";
    String str4 = str1+"n";

    str2=str2.replace("m","MST");
    System.out.println(str2);
   /* System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str4));
    System.out.println("hello".equals(str1));


    System.out.println(str1.equalsIgnoreCase(str2));
    System.out.println(str1.equalsIgnoreCase(str4));
    System.out.println("hello".equalsIgnoreCase(str1));*/
  }
}
