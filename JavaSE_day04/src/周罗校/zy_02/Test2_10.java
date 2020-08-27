package 周罗校.zy_02;

public class Test2_10 {
  public static void main(String[] args) {
    int[] scores = {99,100,98,97,96};
    int max=scores[0];
    int min=scores[0];
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      if(max<scores[i])
        max=scores[i];
      if(min>scores[i])
        min=scores[i];
    }
    for (int i = 0; i < scores.length; i++) {
      if(scores[i]!=max&&scores[i]!=min)
        sum+=scores[i];
    }
    System.out.println("最终得分："+(sum/(scores.length-2)));
  }
}
