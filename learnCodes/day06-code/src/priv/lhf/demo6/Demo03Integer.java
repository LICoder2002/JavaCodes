package priv.lhf.demo6;
/*
    基本类型与字符串直接的相互转换
    基本类型 -> 字符串（String）
        1. 基本类型的值 + "" .
        2. 包装类的静态方法toString ， 不是Object类的toString重载
        3. String类的静态方法valueOf

    字符串 -> 基本类型
        使用包装类的静态方法parseXXX（“字符串”）;

 */

public class Demo03Integer {
    public static void main(String[] args) {
        //    基本类型 -> 字符串（String）
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        //    字符串 -> 基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i + 200);

    }
}
