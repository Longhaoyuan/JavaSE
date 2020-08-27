package lamabaDemo;


interface Multiplication{
  //乘法
  int toMultiplication(int a, int b);
}
class Action{
  private Multiplication mul;

  public Action(Multiplication mul) {
    this.mul = mul;
  }
  public void returnMultiplication(int a,int b){
    System.out.println("两个数的乘积是："+mul.toMultiplication(a,b));
  }
}
public interface LamabaDemo02 {
  public static void main(String[] args) {
    new Action((a,b)->{
      return a*b;
    }).returnMultiplication(12,446);
  }
}
