package day12.checkpoint01.impl;

public class InterImpl implements Inter<String>{
  @Override
  public void show(String s) {
    System.out.println("String类型:"+s);
  }
}
