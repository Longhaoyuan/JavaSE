package day21;

import day21.utils.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 *1. 设置一个类Calculator，包含4个方法：加、减、乘、除，使用JUnit对4个方法进行单元测试。
 *2. 在每个方法运行之前创建Calculator对象，在测试方法运行完毕之后将对象设置为null 。
 * */
public class Test01 {
  static Calculator calculator;

  @Before
  public void setCalculator() {
    System.out.println("创建Calculator对象");
    calculator = new Calculator();
  }

  @After
  public void setCalculatorNull() {
    System.out.println("Calculator对象设置为null");
    calculator = null;
  }

  @Test
  public void sum() {
    calculator.sum(12, 456);
  }

  @Test
  public void minus() {
    calculator.minus(455, 4);
  }

  @Test
  public void multiply() {
    calculator.multiply(12, 16);
  }

  @Test
  public void except() {
    calculator.except(12, 4);
  }
}
