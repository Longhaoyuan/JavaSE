package interview;

/*
* 高频面试题
* */
public class Interview {
  public static void main(String[] args) {
    //面试题一 abcbcbc
    //for（参数1；；）参数1语句只执行一次
    int x=1;
    for(System.out.println("a");x<=3; System.out.println("c")){
      System.out.println("b");
      x++;
    }
    //面试题二：a=1
    int a=1;
    for (int i = 0; i <100 ; i++) {
      a=a++;//a每次赋值，a++，先用后赋值，所以每次a=1，没拿到++后的值
    }
    System.out.println(a);
  }
}
