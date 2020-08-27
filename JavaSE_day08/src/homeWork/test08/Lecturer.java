package homeWork.test08;

public class Lecturer extends Teacher{
  @Override
  public void work() {
    System.out.println("工号为 "+super.getId()+" 的讲师 "+super.getName()+" 在讲课");
  }

  public Lecturer() {

  }

  public Lecturer(int id, String name) {
    super(id, name);
  }

}
