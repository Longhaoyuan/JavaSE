package arrDemo;

public class ReseverArray {
  public static void main(String[] args) {
    int[] arr = {15,586,366,1,2,32,314};
    /*for (int i = 0; i < arr.length/2; i++) {
      int temp;
      temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }*/
    for (int start = 0,end= arr.length-1;start<=end;start++,end--){
      int temp = arr[end];
      arr[end] =arr[start];
      arr[start] =temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
