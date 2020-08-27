package day11;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
  public static void main(String[] args) {
    ArrayList<User> list = new ArrayList<>();
    for (int i = 0; i <= 50; i++) {
      User user = new User();
      user.setId(i);
      list.add(user);
    }
    System.out.println("未分组：");
    System.out.print("[");
    int j = 0;
    for (User user : list) {
      j++;
      if (j != list.size())
        System.out.print(user.getId() + "-" + user.getSort() + ",");
      else
        System.out.print(user.getId() + "-" + user.getSort());
    }
    System.out.println("]");

    Receptionist r1 = new Receptionist();
    Receptionist r2 = new Receptionist();
    Receptionist r3 = new Receptionist();

    r1.setReceptionist(list, 1);//10-19设置v1
    r2.setReceptionist(list, 2);//20-29设置v2
    r3.setReceptionist(list, 3);//其他设置A

    //遍历
    System.out.println("已分组：");
    for (int i = 0; i < list.size(); i++) {
      if (i % 9 == 0&&i!=0)
        System.out.println(list.get(i).getId() + "-" + list.get(i).getSort() + " ");
      else
        System.out.print(list.get(i).getId() + "-" + list.get(i).getSort() + " ");
    }
  }
}
//User类
class User {
  private String sort;
  private int id;

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}


//接口
interface Filter {
  void filterUser(User u);
}

//接待类
class Receptionist {
  //接口属性
  private Filter filter = new Filter() {
    @Override
    public void filterUser(User u) {
      if (u.getId() >= 10 && u.getId() <= 19)
        u.setSort("v1");
      else if (u.getId() >= 20 && u.getId() <= 29)
        u.setSort("v1");
      else
        u.setSort("A");
    }
  };
  //接待方法
  public void reception(){
    System.out.println("欢迎各位的到来");
  }
  //设置接待等级
  public void setReceptionist(List<User> list, int sortLevel) {
    for (int i = 0; i < list.size(); i++) {
      switch (sortLevel) {
        case 1:
          if (i >= 10 && i <= 19) {
            filter.filterUser(list.get(i));
          }
          break;
        case 2:
          if (i >= 20 && i <= 29) {
            filter.filterUser(list.get(i));
          }
          break;
        default:
          filter.filterUser(list.get(i));
          break;
      }
    }
  }

  public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }
}

