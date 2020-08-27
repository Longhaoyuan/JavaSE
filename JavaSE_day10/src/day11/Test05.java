package day11;

public class Test05 {
  public static void main(String[] args) {
    Player player = new Player();

    //创建法师
    FightAble mage = player.select("法师");
    show(mage);
    System.out.println("=================================");
    //创建战士
    FightAble warrior = player.select("战士");
    show(warrior);
  }
  public static void show(FightAble fightAble){
    if (fightAble instanceof Mage){
      System.out.println("选择：法力角色");
    }else
      System.out.println("选择：武力角色");
    fightAble.specialFight();
    fightAble.commonFight();
  }
}
//战斗接口类
interface FightAble{
  void specialFight();
  default void commonFight(){
    System.out.println("普通攻击");
  };
}
//战士类
class Warrior implements FightAble{

  @Override
  public void specialFight() {
    System.out.println("物理攻击");
  }
}
//法师类
class Mage implements FightAble{
  @Override
  public void specialFight() {
    System.out.println("法术攻击");
  }
}
class Player{
  public FightAble select(String str){
    if(str == "法师")
      return new Mage();
    else
      return new Warrior();
  }
}
