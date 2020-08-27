package Demo;
/*
*   数据重载：一个类里面允许多个方法名相同的方法
*     要求数据列表不一样（参数）
*       1、参数个数不一样
*       2、数据类型不一样
*       3、顺序不一样
*
* */
public class Method02 {
  public static int getSum(byte a,byte b){
    return a+b;
  }
  public static int getSum(short a,short b){
    return a+b;
  }
  public static int getSum(char a,char b){
    return a+b;
  }
  public static int getSum(int a,int b){
    return a+b;
  }
  public static float getSum(float a,float b){
    return a+b;
  }
  public static double getSum(double a,double b){
    return a+b;
  }

  public static void main(String[] args) {
    System.out.println((getSum((byte)1,(byte) 45)));
    System.out.println((getSum((short) 1,(short) 45)));
    System.out.println(getSum('a','t'));
    System.out.println(getSum(1,20));
    System.out.println(getSum(45F,48.4545F));
    System.out.println(getSum(4154.14654,4545.487));
  }
}
