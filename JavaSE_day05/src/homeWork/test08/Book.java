package homeWork.test08;

public class Book {
  private String id;
  private String bookName;
  private String sbn;
  private double price;
  private String date;

  public Book() {
  }

  public Book(String id, String bookName, String sbn, double price, String date) {
    this.id = id;
    this.bookName = bookName;
    this.sbn = sbn;
    this.price = price;
    this.date = date;
  }
  public void showBook(){
    System.out.println("id:"+id+",书名："+bookName+",SBN编码："+sbn+",价格：￥"+price+",出版日期："+date);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getSbn() {
    return sbn;
  }

  public void setSbn(String sbn) {
    this.sbn = sbn;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
