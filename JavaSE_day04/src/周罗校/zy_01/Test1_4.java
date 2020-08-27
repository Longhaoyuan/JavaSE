package 周罗校.zy_01;

public class Test1_4 {
  public static char getChar(int num){
    char ch = (char) num;
    if (Character.isLowerCase(ch)){//小写
      return ch;
    }else if(Character.isUpperCase(ch)){//大写
      return ch;
    }else if (Character.isDigit(ch)){//数字
      return ch;
    }else
      return ' ';
  }

  public static void main(String[] args) {
    char aChar = getChar(789);
    System.out.println("字符："+aChar);
    System.out.println((char) 789);
  }
}
