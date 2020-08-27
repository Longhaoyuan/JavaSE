package day12.checkpoint01.impl;

public class InterImpl2<E> implements Inter<E>{
  @Override
  public void show(E e) {
    System.out.println("不确定类型："+e);
  }
}
