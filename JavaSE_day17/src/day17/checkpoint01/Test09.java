package day17.checkpoint01;
/*
* 1. 定义一个求和方法sum,接收一个整形参数num
* 2. 明确递归终止的条件
* 3. 分析递归逻辑：1到n的和等于1到(n-1)的和再加n 4. 开始递归
* */
public class Test09 {
  public static void main(String[] args) {
    int n = 100;
    if (n>=100 &&n<=200){
      System.out.println("1~"+n+"的和为："+sum(n));
    }
  }
  public static int sum (int num){
    if (num==1){
      return 1;
    }else
    return num+sum(--num);
  }
}
