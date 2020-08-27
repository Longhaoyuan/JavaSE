package interfacedemo1.impl;

import interfacedemo1.Fly;
import interfacedemo1.Swimming;

//?????????????


public interface Duck  extends Fly, Swimming {
  @Override
  void fly();

  @Override
  void swimming();
}
