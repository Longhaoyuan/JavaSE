package 周罗校;

public class test2 {
  public static void main(String[] args) {
    //1-100的奇数相加
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      if (i%2!=0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}
