package day09.work06;

public class Test06 {
  public static void main(String[] args) {
    Person teacher = new Teacher("马云", 45);
    SportTeacher teacher2 = new SportTeacher("大姚", 35);
    Person student = new Student("小王", 20);
    SportStudent student2 = new SportStudent("王中王", 21);
//    goToSport(teacher);
    goToSport(teacher2);
//    goToSport(student);
    goToSport(student2);
  }

  public static void goToSport(Sport sport) {
    sport.playBasketball();
  }
}
