package day11.Checkpoint03.goods;

public class ShoppingCart {
  private Goods good;
  private Integer num;

  @Override
  public String toString() {
    return "ShoppingCart{" +
      "good=" + good +
      ", num=" + num +
      ", Sum=" + Sum +
      '}';
  }

  private Double Sum;

  public ShoppingCart() {
  }

  public ShoppingCart(Goods good, Integer num, Double sum) {
    this.good = good;
    this.num = num;
    Sum = sum;
  }

  public Goods getGood() {
    return good;
  }

  public void setGood(Goods good) {
    this.good = good;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Double getSum() {
    return Sum;
  }

  public void setSum(Double sum) {
    Sum = sum;
  }
}
