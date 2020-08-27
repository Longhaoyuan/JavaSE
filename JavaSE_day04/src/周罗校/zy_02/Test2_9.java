package 周罗校.zy_02;

public class Test2_9 {
  public static void main(String[] args) {
    String[] str = {"黑桃", "红桃", "梅花", "方片"};
    String[] point = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
    for (int i = 0; i < str.length; i++) {
      for (int j = 1; j < point.length; j++) {
        System.out.print(str[i] + point[j]+" ");
      }
      System.out.println();
    }
  }
}
