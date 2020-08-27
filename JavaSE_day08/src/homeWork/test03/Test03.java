package homeWork.test03;

public class Test03 {
  public static void main(String[] args) {
    Dog dog = new Dog("旺财","blue",55.65);
    dog.eat();
    dog.watchHome();
    System.out.println("-----------------------------");
    Cat cat = new Cat("波斯猫","while",100.45);
    cat.eat();
    cat.catchMouse();
  }
}
