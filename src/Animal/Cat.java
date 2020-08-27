package Animal;

public class Cat {
  private String color;
  private String name;
  private String eat;

  public Cat(String color, String name, String eat) {
    if (color!=null){
      this.color = color;
    }
    this.color = "white";
    this.name = name;
    this.eat = eat;
  }
  public Cat() {
    this.color="red";
    this.name="des";
    this.eat="grass";
  }

  @Override
  public String toString() {
    return "Cat{" +
      "color='" + color + '\'' +
      ", name='" + name + '\'' +
      ", eat='" + eat + '\'' +
      '}';
  }
}
