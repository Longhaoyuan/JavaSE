package Demo01;

public class Test03 {

  /*
   *   面试题三：
   *     取余数：符号看左边
   * */
  public static void main(String[] args) {
    System.out.println(5 % 3);
    System.out.println(-5 % 3);
    System.out.println(5 % -3);
    System.out.println(-5 % -3);

    /*
     * 面试题四：自增和自减面试题
     *  前-- ++  先减减或先加加后用
     *  后-- ++  先用后加加或减减
     *
     * */
    int a = 10;
    int b = 10;
    int c = 10;
    a = b++;//a=10
    c = --a;//c=9 a=9
    /*System.out.println(a);*/
    b = ++a;//b=10 a=10
    a = c--;//a = 9
    System.out.println(a);
    //c=8
    System.out.println(b);
    System.out.println(c);

    //
    short i =58;
    short at=68;
    /*at = i+56;*/
    at+=95;//自动强行类型转换

    final int num = 1;

    Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
    s.convert(2);

  }

  public interface Converter<T1, T2> {
    void convert(int i);
  }
}
