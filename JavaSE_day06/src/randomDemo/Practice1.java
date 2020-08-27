package randomDemo;

import java.util.Random;

public class Practice1 {
  public static void main(String[] args) {
    int[] arr = new int[20];
    for (int i = 0; i < 20; i++) {
      arr[i]=(new Random().nextInt(100))+1;
    }
    int max = arr[0];
    for (int i = 0; i < 20; i++) {
      if(max<arr[i]){
        max = arr[i];
      }
    }
    System.out.println("最大值是"+max);
  }
}
