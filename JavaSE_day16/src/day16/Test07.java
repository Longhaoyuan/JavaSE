package day16;

public class Test07 {
  public static void main(String[] args) {
      invokeCalc(130,120,(a,b)->{
        return a-b;
      });
  }

  private static void invokeCalc(int a, int b, Calculator calculator) {
    int result = calculator.calc(a, b);
    System.out.println("结果是：" + result);
  }
}

interface Calculator {
  int calc(int a, int b);
}
