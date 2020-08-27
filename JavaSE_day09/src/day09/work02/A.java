package day09.work02;

public interface A {
  void showA();

  default void showB() {
    System.out.println("BBBB");
  }
}
