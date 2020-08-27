package homeWork.test06;

public class Test06 {
  public static void main(String[] args) {
    Manager manager=new Manager("James",9827,15000,3000);
    manager.intro();
    manager.showSalary();
    manager.work();

    Coder coder=new Coder("kobe",0025,10000,0);
    coder.intro();
    coder.showSalary();
    coder.work();
  }
}
