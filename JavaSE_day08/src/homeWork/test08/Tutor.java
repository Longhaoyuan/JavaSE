package homeWork.test08;

public class Tutor extends Teacher{
  public Tutor() {
  }

  public Tutor(int id, String name) {
    super(id, name);
  }

  @Override
  public void work() {
    System.out.println("工号为 "+super.getId()+" 的助教 "+super.getName()+" 在帮助学生解决问题");
  }
}
