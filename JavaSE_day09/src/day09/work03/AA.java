package day09.work03;

public interface AA {
  void showA();
  default void showB10(){
    for (int i = 0; i <10 ; i++) {
      System.out.print("B ");
    }
    System.out.println();
  };
  default void showC10(){
    for (int i = 0; i <10 ; i++) {
      System.out.print("C ");
    }
    System.out.println();
  };
}
