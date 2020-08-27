package homeWork;

public class Test04 {
  public static void main(String[] args) {
    String str = "HelloWorld";
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
    System.out.println("将str字符串转换为小写："+str.toLowerCase());
    System.out.println("将str字符串转换为大写："+str.toUpperCase());
    System.out.println("将str字符串的字符'o'替换成为'6'："+str.replace("o","6"));
    System.out.println("将str字符串的字符'll'替换成为'LL'："+str.replace("ll","LL"));
  }
}
