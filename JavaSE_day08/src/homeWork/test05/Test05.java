package homeWork.test05;

public class Test05 {
  public static void main(String[] args) {
    Teacher teacher = new Teacher("王小平",24,"Java课");
    System.out.println(teacher.getName()+"老师，讲授了"+teacher.getSubject());
    homeWork.test05.Student student = new homeWork.test05.Student("李小乐",15,90);
    System.out.println(student.getName()+"同学，考试得了："+student.getFraction()+"分");
  }
}
