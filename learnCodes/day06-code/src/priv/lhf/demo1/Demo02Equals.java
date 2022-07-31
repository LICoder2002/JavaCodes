package priv.lhf.demo1;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object类中的Equals方法
        public boolean equals(Object obj)
        指示其他某个对象是否与此对象“相等”。

        Object obj : 可以传递任意对象
        基本数据类型 : 比较的是值
        引用数据类型 : 比较的是两个对象的地址值
         */
        Person p1 = new Person("张三",10);
        Person p2 = new Person("李四",12);
        Person p4 = new Person("李四",12);
        Person p3 = p2;

        boolean ret = p2.equals(p4);
        if(ret)
            System.out.println("p2 == p4");
        else
            System.out.println("p2 != p4");
    }
}
