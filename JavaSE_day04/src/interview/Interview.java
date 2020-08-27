package interview;

public class Interview {
  public static void main(String[] args) {
    double a = 1.0/0;
    System.out.println(a);
    //0会向上转型变成无穷小，任何一个初一无穷小都会变成无穷大（微积分）
    /*
     * ECMAScript：所有的脚本语言的标准
     * JavaScript：manzuECMAScript的标准的语言
     * */

    //面试题4：ECMAScript和javaScript  有什么关系

    //面试题5：
    /*
    * jQ对象和JS对象的转换
    *   JQ转JS $(对象名)[0] $(对象名).get(0)
    *   JS转JQ $(JQ对象)
    *
    * */
    //面试题6：JQ的ready和JS的onload有什么区别
    /*
    *   ready：底层使用了DOMContentLoaded事件，只需加载加载完成DOM的基本元素骨架完成即会执行
    *   onload：需要加载页面所有元素（包括图片，Flash动画，音频等）才会执行。
    *
    * */
  }
}
