package priv.lhf.demo06;

public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methidInner();
    }
}
