package homeWork.test08;

public class Test08 {
  public static void main(String[] args) {
    Book book1 = new Book("No0001","泰戈尔诗集","isb4646464414",75.8,"1998-08-07");
    book1.showBook();
    Book book2 = new Book("No0002","红楼梦","isb16464641445",100.54,"2015-07-28");
    book2.showBook();
    Book book3 = new Book("No0003","JavaBean实战","isb4674876487",120.4,"2007-12-15");
    book3.showBook();

    Book[] arr = {book1,book2,book3};
    double price=0;
    int index=0;
    for (int i = 0; i < arr.length; i++) {
      price = arr[0].getPrice();
      if (price<arr[i].getPrice()){
        price=arr[i].getPrice();
        index=i;
      }
    }
    /*System.out.println("最贵的书是："+arr[index].getId()+","+arr[index].getBookName()+","+arr[index].getSbn()+","+arr[index].getPrice()+","+arr[index].getDate());*/
    System.out.print("最贵的书是：");
    arr[index].showBook();
  }
}
