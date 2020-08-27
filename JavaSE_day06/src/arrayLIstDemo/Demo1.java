package arrayLIstDemo;

import java.util.ArrayList;
import java.util.List;

/*
*
* java.util.ArrayList<E> 集合
*   特点：
*     1、大小可变的数组实现
*     2、<E>（泛型）：指的是当前的集合统一存放都是什么类型，反省只能是引用类型
*     3、直接打印集合，不是地址值。打印集合中的元素，没有元素则【】
*     4、创建集合时，右侧<>里面的泛型再jdk1.7可以省略不写，但是<>不能省略
*
*   成员方法：
*     boolean add（E e）将指定的元素添加到此列表的尾部
*     E remove（int index） 将指定索引的元素移出，将移除的元素返回
*     E get（int index）  返回指定索引的元素
*     int size（）  返回该列表的是元素个数
* */
public class Demo1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();

    list.add("马云");
    list.add("马霍腾");
    list.add("许家印");
    list.add("雷军");
    list.add("董明珠");

    System.out.println(list);
    String remove = list.remove(2);
    System.out.println(remove);
    System.out.println(list);
    System.out.println(list.get(2));
    System.out.println(list.size());
  }
}
