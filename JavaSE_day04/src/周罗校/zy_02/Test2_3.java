package 周罗校.zy_02;

public class Test2_3 {
  public static void main(String[] args) {
    int[] nums = {5,10,15};
    int[] newArr = new int[nums.length];
    System.out.println("nums数组：");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+"\t");
      newArr[i]=nums[i]*2;
    }
    System.out.println("\nnewArr新数组：");
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i]+"\t");
    }
  }
}
