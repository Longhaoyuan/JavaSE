package homeWork.test02;

public class Teacher extends Person{
  public Teacher(String name, int age) {
    super(name, age);
  }
  public void teach(){
    System.out.println(name+"上课");
  }
}
