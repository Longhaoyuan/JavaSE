package Homeword;

public class Test8 {
  public static void main(String[] args) {
    char ch = 'J';
    ch = (char) (ch+32);
    System.out.println(ch);

    char ch2 = 'a';
    //65 97
    ch2 -= 32;
    System.out.println(ch2);

    double d3  = 100.5;
    int i3 = 3;
    double sum3 =d3+i3;
    System.out.println("sum3的值："+sum3);
    System.out.println("sum3的整数部分："+(int)sum3);

    double d4=35.415;
    int i4 =20;
    int mul4 = (int) (i4*d4);
    System.out.println("mul4的整数部分："+mul4);
  }
}
