package 周罗校.zy_02;

public class Test2_7 {
  public static void print(int[] arr){
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if(i==arr.length-1)
        System.out.println(arr[i]+"]");
      else
        System.out.print(arr[i]+",");
    }
  }
  public static void equals(int[] arr1,int[] arr2){
    print(arr1);
    print(arr2);
    boolean flag=true;
    if(arr1.length==arr2.length){
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i]!=arr2[i])
          flag = !flag;
      }
    }
    System.out.println("是否一致："+flag);
  }

  public static void main(String[] args) {
    int[] arr1 ={1,2,3,4,3,2,1};
    int[] arr2 ={1,2,3,4,3,2,1};
    equals(arr1,arr2);
  }
}
