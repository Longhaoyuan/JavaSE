package 周罗校;

public class Test9 {
  public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j==i|j==8-i){
          System.out.print("0");
        }else
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
