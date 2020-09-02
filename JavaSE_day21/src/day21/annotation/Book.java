package day21.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
*
* 定义一个注解：Book
* 包含属性：String value()   书名
* 包含属性：double price()  价格，默认值为 100
* 包含属性：String[] authors() 多位作者
1. 定义类在成员方法上使用Book注解
2. 解析获得该成员方法上使用注解的属性值。
* */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
  String value();
  double price();
  String[] authors();
}
