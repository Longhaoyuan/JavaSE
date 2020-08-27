package homeWork.test06;

public class Test06 {
  public static void main(String[] args) {
    //公鸭
    Drake drake = new Drake(2,"红色");
    drake.eat();
    drake.crow();
    //鸭子
    Duck duck = new Duck(1,"黑色");
    duck.eat();
    duck.swim();
  }
}
