package extendsDemo;

public class Teacher extends Fu{
  public String name = "甲壳虫";
  public void teach(){
    System.out.println(name+"正在上课中.....");
  }
  //方法重写
  @Override
  public void eat(){
    super.eat();
    System.out.println(super.name+"就是大憨批");
  }
}
