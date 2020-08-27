package classDemo;

public class TestDog {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.setName("哈市狗");
    dog1.setAge(18);
    dog1.setColor("红色");
    dog1.tailwagging();
    Dog dog2 = new Dog("泰迪尔",8,"米白色");
    dog2.tailwagging();
    Dog dog3 = new Dog("华哥",5,"米黄色");
    dog3.tailwagging();

    Dog[] arr = {dog1,dog2,dog3};
    int age=0;
    int index=0;
    for (int i = 0; i < arr.length; i++) {
      age = arr[0].getAge();
      if (age<arr[i].getAge()){
        age=arr[i].getAge();
        index=i;
      }
    }
    System.out.println(arr[index].getName()+"的年龄最大，它的年龄是"+arr[index].getAge()+"，颜色是"+arr[index].getColor());
  }
}
