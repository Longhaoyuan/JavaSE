package sell.entry;

public class BaoZi {
  private String name;
  private Double price;
  //奇数为消费 偶数为生产
  private Integer flag=0;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }
}
