package priv.lhf.test1;
//求华氏温度100对应的摄氏温度
//计算公式：celsius = 5 * (100 - 32) / 9
public class Test2 {
    public static void main(String[] args) {
      double ret =  5.0*(100-32)/9;
        System.out.println(100+String.format(" %.2f",ret));
    }
}
