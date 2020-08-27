package interfacedemo1;

public interface Fly {
  //默认public abstract 可以把这个省略
  public abstract void  fly();

  //接口中不能有成员变量
  //  int a ;

  
  //转大写快捷键 ctrl+shift+u
  //public final static 修饰
  //常量的命名规则 必须大写多个字符使用_链接
  public final static int HELLO_WORLD =10;
}
