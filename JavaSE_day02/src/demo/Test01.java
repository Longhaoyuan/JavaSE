package demo;

    public class Test01 {
      public static void main(String[] args) {
        /*
         * 类型转换的方法：
         *   自动转换（隐式转换）
         *   强制转换
         * */
        //面试题：为什么 byte result = byteNum+byteNum1会报错？
        //面试/笔试题 //赋值时的常量，自动判断常量有没有超出左侧的范围，没有超出就自动补上强制
        byte byteNum = 10;
        byte byteNum1 = 20;
        byte result = (byte) (byteNum+byteNum1);
        /*byte result = byteNum+byteNum1;*/

        //常量优化机制：不在，常量的类型在还没有编译的时候就已经确认下来了

        //面试二：i>i+1;
        /*
        *   最大值溢出：会自动取反
        * */
        int i=Integer.MAX_VALUE;
        /*byte i = 127;*/
        if(i>i+1){
          System.out.println(true);
        }
        char ch = '2';
        i = ch+1;
        System.out.println(i);

  }
}
