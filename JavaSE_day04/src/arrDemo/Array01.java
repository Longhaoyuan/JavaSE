package arrDemo;
/*
*   数组：是一个容器，可以一次性存放多个值（同类型的数据），长度固定
*     创建数组的三种方式：
*       1、创建数组初始化数组中的元素
*       2、创建数组初始化长度
*       3、创建数组初始化数组中的元素   简写格式
* */
public class Array01 {
  public static void main(String[] args) {
    int[] arr =new  int[5];
    int[] arr1 = new int[]{1,5,21,3,3};
    int[] arr2 = {1,55,56,146,2313,5454};

    System.out.println(arr);
    System.out.println(arr1);
    System.out.println(arr2);
  }
}
