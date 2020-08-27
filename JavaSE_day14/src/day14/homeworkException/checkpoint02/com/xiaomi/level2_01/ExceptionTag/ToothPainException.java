package day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag;

public class ToothPainException extends PainExecption{
  public ToothPainException() {
//    System.out.println("牙疼");
  }

  public ToothPainException(String message) {
    super(message);
//    System.out.println("牙疼");
  }
}
