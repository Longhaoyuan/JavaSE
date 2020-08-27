package day14.homeworkException.checkpoint03;

import java.util.Random;

/*
* 开启一个线程执行任务：随机获得10个100到1000的整数并将10个整数相加求和，
* 将求和结果输出。
* */
public class Test02 {
  public static void main(String[] args) {
    new Thread(()->{
      int sum = 0;
      int[] arr = new int[10];
      Random random = new Random();
      for (int i = 0; i < arr.length; i++) {
        arr[i]=random.nextInt(900)+100;
      }
      for (int i : arr) {
        sum+=i;
      }
      System.out.println("随机获得10个100到1000的整数的和是："+sum);
    }).start();
  }
}
