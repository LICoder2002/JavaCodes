package priv.lhf.demo3;

public class Demo01MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态

        obj.method();//父子都有，优先用子
        obj.showNum();

        obj.methodFu();//子类没有，父类有，向上找父。
        //obj.methodZi();
    }
}
