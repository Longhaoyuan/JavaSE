package annotationdemo.testAnnotationdemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test01 {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
    Class<TestMyTestAnnotation> testMyTestAnnotationClass = TestMyTestAnnotation.class;
    TestMyTestAnnotation instance = testMyTestAnnotationClass.newInstance();//调用构造方法创建对象
    Method[] declaredMethods = testMyTestAnnotationClass.getDeclaredMethods();//获取所有方法
    for (Method m : declaredMethods) {
      if (m.isAnnotationPresent(MyTest.class)){//判断方法使用具有注解或者注解的作用域是否是Runtime
        m.invoke(instance);
      }
    }
  }
}
