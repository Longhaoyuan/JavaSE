package day14.homeworkException.checkpoint02.com.xiaomi.level2_03;

import day14.homeworkException.checkpoint02.com.xiaomi.level2_03.exceptiontag.LoginException;

/*
* 1. 创建包com.xiaomi.level2_03
2. 定义异常类LoginException继承Exception
a) 提供空参和有参构造
3. 创建测试类Test
a) 提供一个用于登陆的方法login(String name,String pwd),在放方法中
i. 如果用户名错误,就抛出自定义登陆异常(LoginException),异常信息为用户名不存在。
ii. 如果密码错了就也抛出登陆异常,异常信息为密码错误。
iii. 如果能来到下面,就说明用户和密码都是对的，输出: 欢迎xxx
b) 提供main方法,在main方法
i. 使用try...catch代码块处理异常
ii. 调用login方法,传入错误用户名,运行程序,报运行时异常,然后注释这行代码
iii. 调用login方法,传入正确用户名,错误的命名,运行程序,报运行时异常,然后注释这行代码 iv. 调用login方法,传入正确的用户名和密码
* */
public class Test03 {
  public static void main(String[] args) {
    String uname ="123";
//    String uname ="12346";
    String upwd ="123";
//    String upwd ="12325";
    login(uname,upwd);
  }
  public static void login(String name,String pwd) {
    String uname ="123";
    String upwd ="123";
  if (name!=uname){
    try {
      throw new LoginException("用户名不存在!!!");
    } catch (LoginException e) {
      e.printStackTrace();
    }
  }else if(upwd!=pwd){
    try {
      throw new LoginException("密码错误!!!");
    } catch (LoginException e) {
      e.printStackTrace();
    }
  }else
    System.out.println("欢迎"+name);
  }
}
