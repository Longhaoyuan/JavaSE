package stringDemo;
/*
* java.lang.String(常量):
* String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作
* 为此类的实例实现。
*   特点：
*     1、字符串是常量；它们的值在创建之后不能更改。
*     2、因为 String 对象是不可变的，所以可以共享。
*
*   注意事项：
*     1、==基本类型比较的是内容，引用类型比较的是地址值
*
* */
public class StringDemo01 {
  public static void main(String[] args) {
    String str1 = new String();
    System.out.println("第一个元素："+str1);

    String str2 = new String("尼亚");
    System.out.println("第二个元素："+str2);

    char[] chr = {'e','f','g','j','f'};
    String str3 = new String(chr);
    System.out.println("第三个元素："+str3);

    byte[] bys = {65,67,68,69,70};
    String str4 = new String(bys);
    System.out.println("第四个元素："+str4);

    String str5 = new String(bys,2,2);
    System.out.println("第五个元素："+str5);
  }
}
