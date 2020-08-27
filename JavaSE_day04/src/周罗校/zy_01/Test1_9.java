package 周罗校.zy_01;

public class Test1_9 {
  public static void chengFaBiao(){
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <=i; j++) {
        System.out.print(j+"×"+i+" = "+(j*i)+"\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    chengFaBiao();
  }
}
