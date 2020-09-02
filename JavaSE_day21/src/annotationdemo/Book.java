package annotationdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
 *元注解：
 *   @Target：注解的使用位置
 *      TYPE： 用在类,接口上
 *      FIELD：用在成员变量上
 *      METHOD： 用在方法上
 *      PARAMETER：用在参数上
 *      CONSTRUCTOR：用在构造方法上
 *      LOCAL_VARIABLE：用在局部变量上
 *      ANNOTATION_TYPE：用在注解上
 *   @Retention：定义该注解的生命周期(有效范围)。
 *      SOURCE：注解只存在于Java源代码中，编译生成的字节码文件中就不存在了。
 *      CLASS：注解存在于Java源代码、编译以后的字节码文件中，运行的时候内存中没有，默认值。
 *      RUNTIME：注解存在于Java源代码中、编译以后的字节码文件中、运行时内存中，程序可以通过 反射获取该注解。
 * */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//注解的有效范围，不指定RUNTIME就会执行时无法解析
public @interface Book {
  String name();

  int age() default 18;

  String sex() default "男";
}
