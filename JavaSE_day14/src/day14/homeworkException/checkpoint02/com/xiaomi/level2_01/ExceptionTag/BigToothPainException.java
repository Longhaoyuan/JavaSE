package day14.homeworkException.checkpoint02.com.xiaomi.level2_01.ExceptionTag;

public class BigToothPainException extends ToothPainException{
  public BigToothPainException() {
//    System.out.println("大牙疼");
  }

  public BigToothPainException(String message) {
    super(message);
//    System.out.println("大牙疼");
  }
}
