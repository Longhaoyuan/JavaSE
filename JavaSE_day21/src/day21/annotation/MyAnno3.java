package day21.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 请定义注解@MyAnno3：
*   1) 包含一个String类型的属性“type”，不定义默认值。
    2) 包含一个int[]数组类型的属性“intArr”，不定义默认值。
    3) 此注解只能修饰“方法”。
    4) 此注解要出现在源码和字节码中。
    5) 定义测试类：Test3，随意定义一个成员方法，并使用此注解；
* */
@Target(ElementType.METHOD)//只能修饰“方法
@Retention(RetentionPolicy.CLASS) //注解要出现在源码和字节码中
public @interface MyAnno3 {
  String type();
  int[] intArr();
}
