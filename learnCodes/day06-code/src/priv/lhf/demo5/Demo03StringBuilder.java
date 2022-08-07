package priv.lhf.demo5;
/*
   StringBuilder和String可以互相转换
   String -> StringBuilder :使用StringBuilder的构造方法
   StringBuilder -> String : 可以使用StringBuilder中的toString方法
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String -> StringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);

        bu.append(" world!");
        System.out.println("bu:"+bu);

        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
