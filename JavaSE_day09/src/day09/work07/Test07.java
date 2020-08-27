package day09.work07;

public class Test07 {
  public static void main(String[] args) {
    Manager m = new Manager("张小强",9000.0);
    Coder c = new Coder("李小亮",5000.0);

    Company company = new Company();
    company.paySalary(m);
    company.paySalary(c);
  }
}
