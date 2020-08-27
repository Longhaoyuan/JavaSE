package arraysDemo;

import java.util.Arrays;

public class ArrayAPI01 {
  public static void main(String[] args) {
    int[] arr = {654,56,5641,641,351,5644,1031,555,300};
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    String str="adsJDASLDJahdsdfoafhsdfh";
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    System.out.println(Arrays.toString(chars));
    for (int i = chars.length - 1; i >= 0; i--) {
      System.out.print(chars[i]+"  ");
    }
  }
}
