package day16;

public class Test06 {
  public static void main(String[] args) {
      invokeDirect(()->{
        System.out.println("导演拍电影啦!");
      });
  }

  private static void invokeDirect(Director director) {
    director.makeMovie();
  }
}

interface Director {
  void makeMovie();
}
