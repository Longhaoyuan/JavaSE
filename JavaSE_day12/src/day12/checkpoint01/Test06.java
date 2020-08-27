package day12.checkpoint01;

import day12.checkpoint01.entities.Person;

public class Test06 {
  public static void main(String[] args) {
    int i =45;
    function(i);
    Person person = new Person("马国宝",15);
    function(person);
  }
 public static <T> T function(T t){
   System.out.println(t);
   return null;
 }
}
