package day11.Checkpoint03.goods;

public class Goods {
  private String id;
  private String name;
  private Double price;
  private String unit;

  public Goods() {
  }

  public Goods(String id, String name, Double price, String unit) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.unit = unit;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }
}
