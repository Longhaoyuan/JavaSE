package day14.homeworkException.checkpoint03.exceptiontag;

public class NoMoneyException extends RuntimeException{
  public NoMoneyException() {
  }

  public NoMoneyException(String message) {
    super(message);
  }
}
