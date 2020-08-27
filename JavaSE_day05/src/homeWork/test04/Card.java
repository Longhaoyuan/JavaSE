package homeWork.test04;

public class Card {
  private String color;
  private int points;

  public Card(String color, int points) {
    this.color = color;
    this.points = points;
  }

  public void showCard(){
    System.out.println("当前的卡牌是"+color+""+points);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
}
