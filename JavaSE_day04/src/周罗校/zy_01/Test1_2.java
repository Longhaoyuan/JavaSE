package 周罗校.zy_01;

public class Test1_2 {
  public static int getSum(int n){
    int sum=0;
    for (int i = 0; i <= n; i++) {
      sum+=i;
    }
    return sum;
  }

  public static void main(String[] args) {
    int a = getSum(100);
    System.out.println(a);
  }
}
