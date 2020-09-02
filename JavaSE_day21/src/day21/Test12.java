package day21;

import day21.annotation.Book;
import day21.annotation.Books;

import java.lang.reflect.Method;

public class Test12 {
  public static void main(String[] args) {
    Class<Books> clazz = Books.class;
    Method[] methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      if (method.isAnnotationPresent(Book.class)) {
        Book annotation = method.getAnnotation(Book.class);
        System.out.print("书名：" + annotation.value() + " 价格：" + annotation.price() + " 作者：");
        for (String author : annotation.authors()) {
          System.out.print(author+" ");
        }
        System.out.println();
      }
    }
  }
}
