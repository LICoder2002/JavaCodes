package priv.lhf.demo01;

public class Demo01Interface {
    public static void main(String[] args) {
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
