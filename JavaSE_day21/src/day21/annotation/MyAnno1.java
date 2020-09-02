package day21.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
*
* 1) 不需要任何属性。
2) 此注解只能修饰“类”和接口
3) 此注解要出现在源码和字节码中
4) 定义测试类：Test1，并使用此注解修饰
* */
@Target({ElementType.TYPE})//此注解只能修饰“类”和接口
@Retention(RetentionPolicy.CLASS)//此注解要出现在源码和字节码中
public @interface MyAnno1 {
}
