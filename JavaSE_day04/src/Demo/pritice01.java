package Demo;

public class pritice01 {
  /*
  * 4 5 8不写
  * */
  public static void main(String[] args) {
    score(75);
    sum();
    getSum();
    getISum();
    getShuixianhua();
    fenHang();
    daYinTu();
  }
  public static void score(int score){
    if(score<0||score>100){
      System.out.println("成绩有误！");
    }else {
      if (score >= 90 && score <= 100) {
        System.out.println("优秀");
      } else if (score >= 80 && score <= 90) {
        System.out.println("好");
      } else if (score >= 70 && score <= 80) {
        System.out.println("良");
      } else if (score >= 60 && score <= 70) {
        System.out.println("及格");
      } else if (score < 60) {
        System.out.println("不及格");
      }
    }
  }
  public static void sum(){
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      if (i%2!=0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
  public static void getSum(){
    int sum =0;
    for (int i = 0; i <= 100; i++) {
      if(i%3==0&&i%5==0){
        System.out.println(i);
        sum+=i;
      }
    }
    System.out.println("1-100之间既是3的倍数又是5的倍数的数字之间的和："+sum);
  }
  public static void getISum(){
    int i = 1;
    while (i<=10){
      System.out.println("i："+i);
      i++;
    }
  }
  public static void getShuixianhua(){
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
  public static void fenHang(){
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
  public static void daYinTu(){
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
