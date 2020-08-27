package homeWork.test02;

public class Coder extends Person{
  public Coder(String name, int age) {
    super(name, age);
  }

  public void coding(){
    System.out.println(name+"掉代码");
  }
}
