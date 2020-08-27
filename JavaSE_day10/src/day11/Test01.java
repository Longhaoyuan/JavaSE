package day11;

interface HandleAble{
  void HandleString (String num);
}
public class Test01 {
  public static void main(String[] args) {
    String num = "23.23456789";
    System.out.println("原数字："+num);
    //匿名内部类
   /* new HandleAble() {
      @Override
      public void HandleString(String num) {
        System.out.println("去整后："+(int) Double.parseDouble(num));
      }
    }.HandleString(num);

    new HandleAble() {
      @Override
      public void HandleString(String num) {
        System.out.println("保留四位小数后："+String.format("%.4f", Double.parseDouble(num)));
      }
    }.HandleString(num);*/

   //使用Lambda表达式
    handle(num,(number)->{
      System.out.println("去整后："+(int) Double.parseDouble(number));
    });

    handle(num,(number)->{
      System.out.println("保留四位小数后："+String.format("%.4f", Double.parseDouble(number)));
    });
  }
  public static void handle(String num,HandleAble handleAble){
    handleAble.HandleString(num);
  }
}
