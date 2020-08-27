package day09.work05;

public class Test05 {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.eat();
    Animal cat = new Cat();
    cat.eat();

    CheckAnimal(dog);
    CheckAnimal(cat);

  }
  public static void CheckAnimal(Animal animal){
    if (animal instanceof Cat){
      ((Cat) animal).catchMouse();
    }else if(animal instanceof Dog){
      ((Dog) animal).lookHome();
    }
  }
}
