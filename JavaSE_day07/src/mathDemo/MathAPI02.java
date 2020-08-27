package mathDemo;

public class MathAPI02 {
  public static void main(String[] args) {
    double num = -10.8;
    int count = 0;
    for (; num < 8.9; num++) {
      if (Math.abs(num) > 6 || Math.abs(num) < 2.1)
        count++;
    }
    System.out.println(count);
  }
}
