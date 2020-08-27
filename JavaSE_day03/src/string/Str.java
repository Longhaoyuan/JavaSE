package string;

public class Str {
  public static void main(String[] args) {
    String str1 = "鸡肋";
    StringBuffer str2 = new StringBuffer("鸡扒");
    StringBuilder str3 = new StringBuilder("鸡腿");
    str2.reverse();
    str3.reverse();
    System.out.println(str1+""+str2+""+str3);

    Integer integer=100;
    String s = Integer.toUnsignedString(100, 16);
    System.out.println(s);
  }
}
