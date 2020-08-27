package string;
/*
* 打印1到5的和
* */
public class test3 {
  public static void main(String[] args) {
    int sum=0;
    for (int i = 0; i <5; i++) {
      sum = sum+i;
    }
    System.out.println(sum);
    //求1到100的和
    int sum1 =0;
    /*for (int i = 0; i <= 100; i++) {
      sum1 = sum1+i;
    }*/
    int j=0;
    /*while(j<=100){
      sum1 = sum1+j;
      j++;
    }*/
    do {
      sum1 = sum1+j;
      j++;
    }while(j<=100);

    System.out.println(sum1);
    //求偶数和与奇数的和
    int obbSum =0;//奇数
    int evenSum = 0;//奇数
    /*for (int i = 0; i <=100; i++) {
      if(i%2==0){
        evenSum = evenSum+i;
      }else{
        obbSum = obbSum+i;
      }
    }*/
    int k=0;
   /* while (k<=100){
      if(k%2==0){
        evenSum = evenSum+k;
      }else{
        obbSum = obbSum+k;
      }
      k++;
    }*/
    do {
      if(k%2==0){
        evenSum = evenSum+k;
      }else{
        obbSum = obbSum+k;
      }
      k++;
    }while (k<=100);
    System.out.println("偶数的和："+evenSum+";奇数的和："+obbSum);

    //求8的阶乘
    int factorial = 1,o=0; //阶乘
    /*for (int i = 1; i <= 8; i++) {
      factorial*= i;
    }*/
    /*while (o<=8){
      factorial*=o;
      o++;
    }*/
    do {
      factorial*=o;
      o++;
    }while (o<=8);
    System.out.println(factorial);
    int num = 0;
    //求水仙花数
    for (int i = 100; i < 500; i++) {
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
