package homeWorld.Test08;

import java.util.ArrayList;
import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    ArrayList<Book> list = new ArrayList<>();
    int index = 1;
    while (true){
      System.out.println("请录入第"+index+"本书的名称：");
      Scanner scanner1 = new Scanner(System.in);
      String name = scanner1.nextLine();

      System.out.println("请录入第"+index+"本书的ISBN编码：");
      Scanner scanner12 = new Scanner(System.in);
      String isbn = scanner1.nextLine();

      System.out.println("请录入第"+index+"本书的名称：");
      Scanner scanner3 = new Scanner(System.in);
      double price = scanner1.nextDouble();
      Book book =new Book(name,isbn,price);
      list.add(book);
      index++;
      if (index>=4)
        break;
    }
    for (Book book : list) {
      System.out.println(book.getTitle()+""+book.getIsbn()+","+book.getPrice());
    }
  }
}
