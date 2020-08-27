package Demo01;

public class Test02 {
  void SetI(){
    int i=Integer.MAX_VALUE;
//    double i = Double.MAX_VALUE;
    System.out.println(i);
    System.out.println(i+1);
    if(i>i+1){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }
  public static void main(String[] args) {
    Test02 t2 = new Test02();
    t2.SetI();
    byte i =1 ;
    byte x = (byte)(i+1);
    System.out.println(x);
    /*
    * 变量
    *   一、创建变量的方法
    *     1、先创建后赋值
    *     2、创建时就开始复制
    *   二、变量的四类八种
    *     1、整形
    *       byte、short、int
    *       long  L
    *     2、浮点型
    *       float F 7位小数点
    *       double  15位小数点
    *     3、布尔型
    *       boolean
    *     4、字符型
    *       char
    *    三、变量字节大小排序
    *    byte=boolean<char=short<int=float<long=double
    *
    * */

    /*
    * 13  1101
    * 10001101  128+13=141
    * 010 001 101
    *  2   1   5  0215
    *  1000 1101
    *    8    D    0x8D
    * */

  }
}
