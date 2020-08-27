package day09.work07;

public class Company implements Money{
  private static double count = 1000000;
  @Override
  public void paySalary(Employee emp) {
    System.out.println("给李小亮发工资："+emp.getSalary()+"元，公司剩余"+(count=count-emp.getSalary())+"元");
  }
}
