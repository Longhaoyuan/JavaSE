package string;

public class test4 {
  public static void main(String[] args) {
    //1-100之间的和，除了3的倍数
    int sum=0;
    for (int i = 0; i <= 100; i++) {
      if (i%3==0){
        continue;
      }else
        sum+=i;
    }
    System.out.println(sum);
    //输出10-20之间的数，遇到个位数为3的数则停止输入
    for (int i = 10; i <= 20; i++) {
      if (i%10==3){
        /*System.out.println(i);*/
        break;
      }else
        System.out.println(i);
    }
  }
}
