package homeWork.test06;

public class Drake extends Poultry{
  public Drake(int age, String color) {
    super(age, color);
  }

  @Override
  public void eat() {
    System.out.println(super.getAge()+"的"+super.getColor()+"的公鸡会啄米");
  }
  public void crow() {
    System.out.println(super.getAge()+"的"+super.getColor()+"的公鸡会打鸣");
  }
}
