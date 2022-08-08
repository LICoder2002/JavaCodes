package priv.lhf.demo02.Set;
/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，不是数据世纪存储的物理地址)
    在Object类中：
        int hashCode(); 返回对象得到哈希码值
        hashCode方法的源码：
            public native int hashCode();
            native:代表该方法调用的是本地操作系统的方法
 */
public class Demo02HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);
        System.out.println(p1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        System.out.println(p2);


        /*
            String类的哈希值
                String类重写了Object的hashCode方法
         */

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
