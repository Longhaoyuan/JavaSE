package string;

//画三角形
public class Triangle {
  public static void main(String[] args) {
    //画直角三角形
    /*for (int i = 0; i < 5; i++) {
      for (int i1 = i; i1 < 5; i1++) {
        System.out.print("❀");
      }
      System.out.println();
    }
    for (int i = 1; i <=5; i++) {
      for (int i1 =1 ; i1 <=i; i1++) {
        System.out.print("❀");
      }
      System.out.println();
    }*/
    for (int i = 4; i >=0; i--) {
      for (int j = 1; j <= 7; j++) {
        if (j==i||j==8-i) {
          for (j = i; j <= 8- i; j++) {
            System.out.print("❀");
          }
        }else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
