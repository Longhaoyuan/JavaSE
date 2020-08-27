package 周罗校;

public class test7 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 0; i <= 60; i++) {
      if (i % 2 == 0) {
        if (count >= 5) {
          count = 0;
          System.out.print(i);
          System.out.println();
        } else
          System.out.print(i + " ");
        count++;
      }
    }
  }
}
