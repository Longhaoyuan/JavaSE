package arrDemo;

public class Sort {
  public static void main(String[] args) {
    int[] arr ={5,4679791,3646,56464,8,29,56454,68,6,2,4};
//    print(selectSort(selectSort(arr)));
//    print(selectSort(selectSort2(arr)));
//    print(selectSort(bubbleSort(arr)));
    print(selectSort(shellSort(arr)));
}
  //遍历
  public static void print(int[] arr){
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if(i==arr.length-1)
        System.out.println(arr[i]+"]");
      else
        System.out.print(arr[i]+",");
    }
  }
  //选择排序
  public static int[] selectSort(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if(arr[i]>arr[j]){
          change(arr,i,j);
        }
      }
    }
    return arr;
  }
  //优化选择排序
  public static int[] selectSort2(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      int num = arr[i];
      int index =i;
      for (int j = i+1; j < arr.length; j++) {
        if(num>arr[j]){
          num=arr[j];
          index=j;
        }
      }
      if (index==i){
        change(arr,i,index);
      }
    }
    return arr;
  }
  //选择排序升级版：希尔排序
  public static int[] shellSort(int[] arr){
    int gap = arr.length;
    while (true){
      gap/=2;//增量每次减二
      for (int i = 0; i < gap; i++) {
        for (int j = i+gap; j < arr.length; j+=gap) {//里面就是一个选择排序
          int temp = arr[j];
          int k =j-gap;
          while (k>=0&&arr[k]>temp){
            arr[k+gap] = arr[k];
            k-=gap;
          }
          arr[k+gap] =temp;
        }
      }
      if(gap==1){
        break;
      }
    }
    return arr;
  }

  public static int[] shellSort1(int arr[]){
    int len = arr.length;
    while (true){
      int gap=len/2;
      for (int i=0;i<gap;i++){
        for (int j = i+gap; j < arr.length; j+=gap) {
          int k = j-gap;
          if(arr[k]<arr[j]){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
          }
        }
      }
      if (gap==1)
        break;
    }
    return arr;
  }
  //冒泡排序
  public static int[] bubbleSort(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if (arr[j]>arr[j+1]){
          change(arr,j,j+1);
        }
      }
    }
    return arr;
  }
  //排序更换方法
  public static void change(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;
  }

}
