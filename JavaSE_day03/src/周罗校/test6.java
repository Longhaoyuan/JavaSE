package 周罗校;

public class test6 {
  public static void main(String[] args) {
    int num = 0;
    for (int i = 100; i <= 999; i++) {
      int a = i%10;  //个位
      int b = (i/10)%10;  //十位
      int c = i/100;  //百位
      num = (int) (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
      if(num==i){
        System.out.println(i);
      }
    }
  }
}
