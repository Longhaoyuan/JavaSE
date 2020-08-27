package 周罗校.zy_02;

public class Test2_4 {
  public static void printBall(int[] array){
    System.out.println("您的双色球号码为：");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+"\t");
    }
  }
  public static void main(String[] args) {
    int[] arr={1,8,10,12,18,12};
    printBall(arr);
  }
}
