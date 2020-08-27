package homeWork.test03;

public class Animal {
  public String name;
  public String color;
  public double price;

  public Animal() {
  }

  public Animal(String name, String color, double price) {
    this.name = name;
    this.color = color;
    this.price = price;
  }

  public void eat(){
    System.out.println(name+"吃饭");
  }
}
