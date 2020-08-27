package arrDemo;
/*
* 数组作为方法的返回值和参数，返回的都是数组的地址值进行操作
* */
public class Arr3 {
  public static void main(String[] args) {
    int[] arr = {45,12,54,41,54,15,4151,3};
    print(arr);
    print(reverse(arr));
  }
  //数组反转的方法
  public static int[] reverse(int[] arr){
    for (int i = 0; i < arr.length/2; i++) {
      int temp;
      temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }
    return arr;
  }
  //遍历的方法
  public static void print(int[] arr){
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if(i==arr.length-1)
        System.out.println(arr[i]+"]");
      else
        System.out.print(arr[i]+",");
    }
  }
}
