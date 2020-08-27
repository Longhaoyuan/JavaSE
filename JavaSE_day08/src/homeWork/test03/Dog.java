package homeWork.test03;

public class Dog extends Animal{
  public Dog(String name, String color, double price) {
    super(name, color, price);
  }

  public void watchHome(){
    System.out.println(name+"看家");
  }
}
