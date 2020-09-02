package day21.annotation;

public class Books {
  @Book(value = "红楼梦",price = 45.6,authors = {"曹雪芹","高鹗续写"})
  public void hongLouMeng(){

  }
  @Book(value = "西游记",price = 55,authors = {"吴承恩"})
  public void xiYouJi(){

  }
  @Book(value = "水浒传",price = 40,authors = {"施耐庵"})
  public void shuiHuZhuang(){

  }
}
