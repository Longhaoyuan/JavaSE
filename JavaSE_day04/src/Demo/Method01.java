package Demo;

public class Method01 {
  /*
  * 修饰符类型：public static
  * 方法调用的 三种：
  *   1、直接调用
  *   2、输出调用
  *   3、复制调用
  *
  * */
  public static void main(String[] args) {
    System.out.println(compare(12,54));
    System.out.println(sum());
    print(5);
  }
  public static boolean compare(int num1,int num2){
    return num1==num2?true:false;
  }
  public static int sum(){
    int sum=0;
    for (int i = 0; i <= 100; i++) {
      sum+=i;
    }
    return sum;
  }
  public static  void print(int count){
    for (int i = 0; i < count; i++) {
      System.out.println("Hello World"+i);
    }
  }
}
