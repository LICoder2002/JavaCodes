package priv.lhf.test1;
//写一个程序显示如下式子的结果：
//        PI = 4 *(1 -1/3 +1/5 -1/7 +1/9 -1/11 +1/13).
//        在程序中使用1.0代替1。
public class Test4 {
    public static void main(String[] args) {
        double ret = 4 *(1.0 -1.0/3 +1.0/5 -1.0/7 +1.0/9 -1.0/11 +1.0/13);
        System.out.println(ret);
    }
}
