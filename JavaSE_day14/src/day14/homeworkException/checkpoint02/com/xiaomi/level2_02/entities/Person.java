package day14.homeworkException.checkpoint02.com.xiaomi.level2_02.entities;

import day14.homeworkException.checkpoint02.com.xiaomi.level2_02.exceptiontag.NoLifeValueExption;

/*
* a) 属性：名称(name)和生命值(lifeValue)
b) 提供空参构造
c) 提供有参构造
* */
public class Person {
  private String name;
  private int lifeVaule;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLifeVaule() {
    return lifeVaule;
  }

  public void setLifeVaule(int lifeVaule) {
    this.lifeVaule = lifeVaule;
    if (lifeVaule<0){
      throw new NoLifeValueExption("生命值不能为负数:"+name);
    }
  }

  public Person() {
  }

  public Person(String name, int lifeVaule) throws NoLifeValueExption {
    this.name = name;
    this.lifeVaule = lifeVaule;
   /* if (lifeVaule<0){
      throw new  NoLifeValueExption();
    }*/
  }
}
