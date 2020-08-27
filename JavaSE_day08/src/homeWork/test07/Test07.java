package homeWork.test07;

public class Test07 {
  public static void main(String[] args) {
    Maneger manager =new Maneger("m110","老王",10000);
    manager.eat();
    manager.work();

    Cooker cooker = new Cooker("c110","小王",6000);
    cooker.eat();
    cooker.work();
  }
}
