import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class ListStream {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("阿松大");
    list.add("无数");
    list.add("大量");
    list.add("大张伟");
    list.add("大小周");
    list.add("大小周");
    //filter过滤器，过滤前面几个
   /* list.stream().filter(s -> {
      return s.startsWith("大");
    }).forEach(System.out::println);*/
    //
   /* list.stream().filter(s -> {
      return s.startsWith("大")&&s.length()==3;
    }).forEach(System.out::println);*/
    //筛选前面的几个limit
    /*list.stream().filter(s -> {
      return s.startsWith("大");
    }).limit(2).forEach(System.out::println);*/
    //跳过前面几个
    /*list.stream().skip(2).forEach(System.out::println);*/

    //Stream转换成List/Set
    //转换成Set可以去重
    Set<String> set = list.stream().collect(Collectors.toSet());
    System.out.println(set);
  }
}
