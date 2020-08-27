package Demo01;

public class test05 {
  /*
  *   比较运算符，返回结果 true false
  *   == > >= < <= !=
  *
  *   面试题4：= == ===的区别:
  *   = 赋值
  *   == 比较两个数是否相等
  *   === js才有的，先比较类型在比较值
  * */

  public static void main(String[] args) {
    System.out.println(5==1);
    System.out.println(5==5);

    System.out.println(5>2);
    System.out.println(5<2);

    System.out.println(5>=5);
    System.out.println(5<=5);

    System.out.println(5!=2);


    //三元表达式
    int a=10,b=80,c=30;
    /*int max = a>b?(a>c?a:c):(b>c?b:c);*/
    System.out.println(a>b?(a>c?a:c):(b>c?b:c));


    /*new Thread(
      ()-> System.out.println("Good boy!")
    ).start();*/
  }
}
