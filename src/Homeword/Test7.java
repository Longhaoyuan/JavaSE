package Homeword;

public class Test7 {
  public static void add(int x,int y){
    System.out.println("x,y的和为："+(x+y));
  }
  public static void sub(int x,int y){
    System.out.println("x,y的差为："+(x-y));
  }
  public static void mul(int x,int y){
    System.out.println("x,y的积为："+(x*y));
  }
  public static void div(int x,int y){
    System.out.println("x,y的商为："+(x/y));
  }
  public static void remian(int x,int y){
    System.out.println("x,y的余数为："+(x%y));
  }
  public static void main(String[] args) {
    int x =45,y=12;
    add(x,y);
    sub(x,y);
    mul(x,y);
    div(x,y);
    remian(x,y);
  }
}
