package day14.homeworkException.checkpoint01.com.xiaomi.level07.entities;

import day14.homeworkException.checkpoint01.com.xiaomi.level07.NoScoreException;

/*
 * 学号,姓名和分数,分数永远不能为为负数
 * */
public class Student {
  private String id;
  private String name;
  private double scroce;

  public Student() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScroce() {
    return scroce;
  }

  public void setScroce(double scroce){
    if (scroce < 0) {
      throw new NoScoreException("分数不能为负数:"+name);
    } else
      this.scroce = scroce;
  }

  @Override
  public String toString() {
    return "Student{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", scroce=" + scroce +
      '}';
  }

  public Student(String id, String name, double scroce) {
    if (scroce < 0) {
      throw new NoScoreException("分数不能为负数:"+name);
    }else {
      this.id = id;
      this.name = name;
      this.scroce = scroce;
    }
  }

}
