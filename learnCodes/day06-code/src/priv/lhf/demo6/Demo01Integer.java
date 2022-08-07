package priv.lhf.demo6;

public class Demo01Integer {
    public static void main(String[] args) {
        //装箱

        //1、构造方法
        Integer in1 = new Integer(1); //方法上的红线表示方法过时
        System.out.println(in1);

        Integer in2 = new Integer("12");
        System.out.println(in2);

        //2、静态方法
        Integer in3 = Integer.valueOf("123");
        System.out.println(in3);

        Integer in4 = Integer.valueOf(123);
        System.out.println(in4);


        //拆箱
        int i = in3.intValue();
        System.out.println(i);
    }
}
