package Homeword;

public class Test4 {
  public static void main(String[] args) {
    int a1 =10 , a2 =11;
   /* System.out.println((a1%2==0)?"10是偶数?true":"10是偶数?false");
    System.out.println((a2%2==0)?"11是偶数?true":"11是偶数?false");*/
    System.out.println(a1+"是偶数?"+(a1%2==0));
    System.out.println(a2+"是偶数?"+(a2%2==0));

    int b1 =12 , b2 =13;
    /*System.out.println((b1%2==1)?"12是奇数?true":"12是奇数?false");
    System.out.println((b2%2==1)?"13是奇数?true":"13是奇数?false");*/
    System.out.println(b1+"是奇数?"+(b1%2!=0));
    System.out.println(b2+"是奇数?"+(b2%2!=0));
  }
}
