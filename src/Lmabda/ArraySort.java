package Lmabda;

import Enties.Person;

import java.util.Arrays;

public class ArraySort {
  public static void main(String[] args) {
    Person[] array = {
      new Person("古力娜扎", 487),
      new Person("迪丽热巴", 87),
      new Person("马尔扎哈", 20) };
    Arrays.sort(array, (Person a, Person b)->{
      return a.getSex()-b.getSex();
    });
    for (Person person : array) {
      System.out.println(person);
    }
  }
}
