package homeWork.test02;

public class Test02 {
  public static void main(String[] args) {
    Coder coder = new Coder("马化腾",45);
    coder.eat();
    coder.sleep();
    coder.coding();
    System.out.println("-----------------------------");
    Teacher teacher = new Teacher("马化腾",32);
    teacher.eat();
    teacher.sleep();
    teacher.teach();
  }
}
