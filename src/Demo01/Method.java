package Demo01;


//方法抽取
public class Method {
  public static int getSum(int a,int b){
    return a+b;
  }


  public static void getMax(int a,int b){
    int max = a>b?a:b;
    System.out.println(max);
  }
  public static void getMax(int a,int b,int c){
    System.out.println(a>b?(a>c?a:c):(b>c?b:c));
  }
  public static void main(String[] args) {
    System.out.println(getSum(7,5));
    getMax(1,2,3);
    getMax(5,57);
  }
}
