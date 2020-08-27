package authority.authority;

import authority.Student;

public class zi extends Student {
  public void set(){
    //不同包内的子类不能使用 private default
//    System.out.println(name);
    System.out.println(age);
//    System.out.println(id);
    System.out.println(hobby);
  }
}
