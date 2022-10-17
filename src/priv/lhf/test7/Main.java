package priv.lhf.test7;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,2);

        System.out.println("面积为：" + cylinder.area());
        System.out.println("体积为：" + cylinder.volume());
    }
}