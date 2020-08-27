package 周罗校.zy_01;

public class Test1_6 {
  public static void printX(){
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

  public static void main(String[] args) {
    printX();
  }
}
