package 周罗校.zy_02;

public class Test2_6 {
  public static void print(int[] arr){
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if(i==arr.length-1)
        System.out.print(arr[i]+"]");
      else
        System.out.print(arr[i]+",");
    }
  }
  public static void main(String[] args) {
    int[] arr ={1,2,3,4,3,2,1};
    print(arr);
    boolean flag = true;
    for (int i = 0; i < arr.length/2; i++) {
      if(arr[i]!=arr[arr.length-1-i]){
        flag=!flag;
      }
    }
    System.out.print("是否对称："+flag);
  }
}
