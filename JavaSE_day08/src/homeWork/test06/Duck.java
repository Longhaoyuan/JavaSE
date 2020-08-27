package homeWork.test06;

public class Duck extends Poultry {
  public Duck(int age, String color) {
    super(age, color);
  }

  @Override
  public void eat() {
    System.out.println(super.getAge()+"的"+super.getColor()+"的公鸡会吃饭");
  }
  public void swim() {
    System.out.println(super.getAge()+"的"+super.getColor()+"的公鸡会游泳");
  }
}
